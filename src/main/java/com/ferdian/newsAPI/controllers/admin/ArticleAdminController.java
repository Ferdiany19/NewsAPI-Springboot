package com.ferdian.newsAPI.controllers.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ferdian.newsAPI.services.article.ArticleService;

@RestController
@RequestMapping("/api/v1/admin/articles")
@PreAuthorize("hasRole('ADMIN')")
public class ArticleAdminController {

    @Autowired
    ArticleService articleService;

    @PutMapping("/publish")
    public ResponseEntity<?> publishArticle(@RequestParam String id) {
        return articleService.publishArticleService(id);
    }
}
