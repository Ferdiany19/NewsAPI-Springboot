package com.ferdian.newsAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ferdian.newsAPI.models.Article;

public interface ArticleRepository extends JpaRepository<Article, String> {

}
