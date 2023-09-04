package com.ferdian.newsAPI.payloads.req;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ArticleRequest {
    @NotEmpty(message = "Title cannot be empty")
    private String title;
    @NotEmpty(message = "Content cannot be empty")
    private String content;
    @NotNull(message = "Category cannot be empty")
    private Long category;
    @NotEmpty(message = "Author cannot be empty")
    private String author;
}
