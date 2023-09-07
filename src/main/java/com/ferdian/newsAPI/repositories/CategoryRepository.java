package com.ferdian.newsAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ferdian.newsAPI.models.Category;
import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByCategory(String category);

    Boolean existsByCategory(String category);
}
