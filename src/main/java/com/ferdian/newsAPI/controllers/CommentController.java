package com.ferdian.newsAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ferdian.newsAPI.payloads.req.CommentRequest;
import com.ferdian.newsAPI.services.comment.CommentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {
    @Autowired
    CommentService commentService;

    @PostMapping
    public ResponseEntity<?> createArticleComment(@RequestBody @Valid CommentRequest request) {
        return commentService.createArticleCommentService(request);
    }

    @GetMapping
    public ResponseEntity<?> getArticleComments() {
        return commentService.getArticleCommentsService();
    }

    @GetMapping("/{articleId}")
    public ResponseEntity<?> getArticleCommentsByArticle(@PathVariable String articleId) {
        return commentService.getArticleCommentsByArticleService(articleId);
    }
}
