package com.ferdian.newsAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ferdian.newsAPI.payloads.req.ArticleRequest;
import com.ferdian.newsAPI.payloads.req.UpdateArticleRequest;
import com.ferdian.newsAPI.services.article.ArticleService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/articles")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @GetMapping
    public ResponseEntity<?> getAllArticles() {
        return articleService.getArticleService();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getArticleById(@PathVariable String id) {
        return articleService.getArticleById(id);
    }

    @GetMapping("/latest")
    public ResponseEntity<?> getLatestArticle() {
        return articleService.getArticleService();
    }

}
