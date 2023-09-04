package com.ferdian.newsAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ferdian.newsAPI.payloads.req.ArticleRequest;
import com.ferdian.newsAPI.services.article.ArticleService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/articles")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @PostMapping("/create")
    public ResponseEntity<?> createArticle(@RequestBody @Valid ArticleRequest request) {
        return articleService.createArticleService(request);
    }

    @GetMapping
    public ResponseEntity<?> getArticles() {
        return articleService.getArticleService();
    }

    @GetMapping("/latest")
    public ResponseEntity<?> getLatestArticle() {
        return articleService.getArticleService();
    }

    @PutMapping("/publish")
    public ResponseEntity<?> publishArticle(@RequestParam String id) {
        return articleService.publishArticleService(id);
    }
}
