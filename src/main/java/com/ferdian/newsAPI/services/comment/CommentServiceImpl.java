package com.ferdian.newsAPI.services.comment;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ferdian.newsAPI.models.Article;
import com.ferdian.newsAPI.models.Comment;
import com.ferdian.newsAPI.payloads.req.CommentRequest;
import com.ferdian.newsAPI.payloads.res.ResponseHander;
import com.ferdian.newsAPI.repositories.ArticleRepository;
import com.ferdian.newsAPI.repositories.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    CommentRepository commentRepository;

    @Override
    public ResponseEntity<?> createArticleCommentService(CommentRequest request) {
        Article article = articleRepository.findById(request.getArticleId()).orElseThrow(() -> {
            throw new NoSuchElementException("Article is not found!");
        });

        Comment comment = new Comment(request.getComment(), article, request.getCommentUser());
        commentRepository.save(comment);

        return ResponseHander.responseMessage(HttpStatus.CREATED.value(),
                "Success Add Comment", true);
    }

    @Override
    public ResponseEntity<?> getArticleCommentsService() {
        List<Comment> comments = commentRepository.findAll();
        return ResponseHander.responseData(HttpStatus.OK.value(), "Success get All Comment!", comments);
    }

    @Override
    public ResponseEntity<?> getArticleCommentsByArticleService(String articleId) {
        Article article = articleRepository.findById(articleId).orElseThrow(() -> {
            throw new NoSuchElementException("Article is not found!");
        });
        List<Comment> comments = commentRepository.findByArticle(article);

        return ResponseHander.responseData(HttpStatus.OK.value(), "Success get All Comment!", comments);
    }

}
