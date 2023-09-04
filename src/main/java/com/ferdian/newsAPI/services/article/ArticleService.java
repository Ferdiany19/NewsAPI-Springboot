package com.ferdian.newsAPI.services.article;

import org.springframework.http.ResponseEntity;

import com.ferdian.newsAPI.payloads.req.ArticleRequest;

public interface ArticleService {
    ResponseEntity<?> createArticleService(ArticleRequest request);

    ResponseEntity<?> getArticleService();

    ResponseEntity<?> publishArticleService(String id);
}
