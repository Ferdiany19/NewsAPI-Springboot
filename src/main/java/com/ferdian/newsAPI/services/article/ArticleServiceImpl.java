package com.ferdian.newsAPI.services.article;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ferdian.newsAPI.models.Article;
import com.ferdian.newsAPI.models.Category;
import com.ferdian.newsAPI.models.User;
import com.ferdian.newsAPI.payloads.req.ArticleRequest;
import com.ferdian.newsAPI.payloads.req.UpdateArticleRequest;
import com.ferdian.newsAPI.payloads.res.ResponseHander;
import com.ferdian.newsAPI.repositories.ArticleRepository;
import com.ferdian.newsAPI.repositories.CategoryRepository;
import com.ferdian.newsAPI.repositories.UserRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public ResponseEntity<?> createArticleService(ArticleRequest request) {
        User author = userRepository.findByUsername(request.getAuthor()).orElseThrow(() -> {
            throw new EntityNotFoundException("Author not found!");
        });

        Category category = categoryRepository.findByCategory(request.getCategory());

        if (category == null) {
            throw new EntityNotFoundException("Category not found!");
        }

        Article article = new Article(request.getTitle(), request.getContent(), category, author);
        articleRepository.save(article);

        return ResponseHander.responseMessage(HttpStatus.CREATED.value(), "Successfully Created Article", true);
    }

    @Override
    public ResponseEntity<?> getArticleService() {
        List<Article> articles = articleRepository.findAll();

        return ResponseHander.responseData(HttpStatus.OK.value(), "Success Get Articles", articles);
    }

    @Override
    public ResponseEntity<?> publishArticleService(String id) {
        Article article = articleRepository.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("Article is not found!");
        });
        article.setIsPublished(true);
        articleRepository.save(article);
        return ResponseHander.responseMessage(HttpStatus.CREATED.value(), "Success Publish Article", true);
    }

    @Override
    public ResponseEntity<?> getLastestArticleService() {
        List<Article> articles = articleRepository.OrderByCreatedAtDesc();
        return ResponseHander.responseData(HttpStatus.OK.value(), "Gett All Articles", articles);
    }

    @Override
    public ResponseEntity<?> updateArticlesService(UpdateArticleRequest request) {
        Article article = articleRepository.findById(request.getArticleId()).orElseThrow(() -> {
            throw new NoSuchElementException("Article is not found!");
        });

        if (!request.getTitle().isEmpty()) {
            article.setTitle(request.getTitle());
        }
        if (!request.getContent().isEmpty()) {
            article.setTitle(request.getContent());
        }

        if (request.getCategory() != null) {
            Category category = categoryRepository.findByCategory(request.getCategory());
            article.setCategory(category);
        }

        if (!request.getUpdatedBy().equalsIgnoreCase("creator") && !request.getTitle().equalsIgnoreCase("admin")) {
            throw new IllegalArgumentException("Only admin and creator can update article!");
        }

        articleRepository.save(article);
        return ResponseHander.responseData(HttpStatus.CREATED.value(), "Article successfully updated!", article);
    }

    @Override
    public ResponseEntity<?> getArticleById(String id) {

        Article article = articleRepository.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("Article is not found!");
        });
        if (article.getIsPublished() == true) {
            article.setViewCounts(article.getViewCounts() + 1);
        }
        articleRepository.save(article);

        return ResponseHander.responseData(HttpStatus.OK.value(), "Success", article);
    }

}
