package com.ferdian.newsAPI.payloads.req;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UpdateArticleRequest {
    @NotEmpty(message = "Article id cannot be empty")
    private String articleId;
    private String title;
    private String content;
    private String category;
    @NotEmpty(message = "Updated By cannot be empty")
    private String updatedBy;
}
