package com.ferdian.newsAPI.services.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ferdian.newsAPI.models.Category;
import com.ferdian.newsAPI.payloads.req.CategoryRequest;
import com.ferdian.newsAPI.payloads.res.ResponseHander;
import com.ferdian.newsAPI.repositories.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public ResponseEntity<?> createCategoryService(CategoryRequest request) {
        Category category = new Category(request.getCategory());
        categoryRepository.save(category);
        return ResponseHander.responseData(201, "Category Added!", category);
    }

    @Override
    public ResponseEntity<?> getCategoryService() {
        List<Category> category = categoryRepository.findAll();
    return ResponseHander.responseData(HttpStatus.OK.value(), "Get All Category!", category);
    }
}
