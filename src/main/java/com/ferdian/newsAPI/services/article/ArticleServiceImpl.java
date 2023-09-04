package com.ferdian.newsAPI.services.article;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ferdian.newsAPI.models.Article;
import com.ferdian.newsAPI.models.Category;
import com.ferdian.newsAPI.models.User;
import com.ferdian.newsAPI.payloads.req.ArticleRequest;
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
            throw new EntityNotFoundException("Author tidak ditemukan");
        });

        Category category = categoryRepository.findById(request.getCategory()).orElseThrow(() -> {
            throw new EntityNotFoundException("Category Not Found!");
        });

        if (!author.getRole().getRole().equalsIgnoreCase("creator")
                && !author.getRole().getRole().equalsIgnoreCase("admin")) {
            throw new IllegalArgumentException("This can only create by Creator or Admin role");
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

}
