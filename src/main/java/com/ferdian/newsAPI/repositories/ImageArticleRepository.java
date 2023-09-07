package com.ferdian.newsAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ferdian.newsAPI.models.ImageArticle;

public interface ImageArticleRepository extends JpaRepository<ImageArticle, String> {

}
