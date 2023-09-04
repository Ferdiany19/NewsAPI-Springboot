package com.ferdian.newsAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ferdian.newsAPI.models.Article;
import com.ferdian.newsAPI.models.Comment;
import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByArticle(Article article);
}
