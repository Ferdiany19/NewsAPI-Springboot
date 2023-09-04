package com.ferdian.newsAPI.services.comment;

import org.springframework.http.ResponseEntity;

import com.ferdian.newsAPI.payloads.req.CommentRequest;

public interface CommentService {
    ResponseEntity<?> createArticleCommentService(CommentRequest request);

    ResponseEntity<?> getArticleCommentsService();

    ResponseEntity<?> getArticleCommentsByArticleService(String articleId);
}
