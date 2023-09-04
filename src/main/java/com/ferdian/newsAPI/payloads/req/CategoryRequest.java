package com.ferdian.newsAPI.payloads.req;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CategoryRequest {
    @NotEmpty(message = "Category cannot be empty")
    private String category;
}
