package com.ferdian.newsAPI.services.category;

import org.springframework.http.ResponseEntity;

import com.ferdian.newsAPI.payloads.req.CategoryRequest;

public interface CategoryService {
    ResponseEntity<?> createCategoryService(CategoryRequest request);
}
