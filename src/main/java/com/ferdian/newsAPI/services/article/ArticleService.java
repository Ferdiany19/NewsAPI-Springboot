package com.ferdian.newsAPI.services.article;

import org.springframework.http.ResponseEntity;

import com.ferdian.newsAPI.payloads.req.ArticleRequest;
import com.ferdian.newsAPI.payloads.req.UpdateArticleRequest;

public interface ArticleService {
    ResponseEntity<?> createArticleService(ArticleRequest request);

    ResponseEntity<?> getArticleService();

    ResponseEntity<?> publishArticleService(String id);

    ResponseEntity<?> getLastestArticleService();

    ResponseEntity<?> updateArticlesService(UpdateArticleRequest request);

    ResponseEntity<?> getArticleById(String id);
}
