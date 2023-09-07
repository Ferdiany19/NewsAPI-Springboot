package com.ferdian.newsAPI.controllers.creator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ferdian.newsAPI.payloads.req.ArticleRequest;
import com.ferdian.newsAPI.services.article.ArticleService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/articles")
@PreAuthorize("hasRole('CREATOR') or hasRole('ADMIN')")
public class ArticleCreatorController {
    @Autowired
    ArticleService articleService;

    @PostMapping("/create")
    public ResponseEntity<?> createArticle(@RequestBody @Valid ArticleRequest request) {
        return articleService.createArticleService(request);
    }

}
