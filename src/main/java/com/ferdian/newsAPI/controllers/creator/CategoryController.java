package com.ferdian.newsAPI.controllers.creator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ferdian.newsAPI.payloads.req.CategoryRequest;
import com.ferdian.newsAPI.services.category.CategoryService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/categories")
@PreAuthorize("hasRole('CREATOR') or hasRole('ADMIN')")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @PostMapping("/create")
    public ResponseEntity<?> createCategory(@RequestBody @Valid CategoryRequest request) {
        return categoryService.createCategoryService(request);
    }

    @GetMapping
    public ResponseEntity<?> getAllCategory() {
        return categoryService.getCategoryService();
    }
}
