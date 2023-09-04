package com.ferdian.newsAPI.payloads.req;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CommentRequest {
    @NotEmpty(message = "Comment is required.")
    private String comment;
    @NotEmpty(message = "article id is required.")
    private String articleId;
    @NotEmpty(message = "CommentUser is required.")
    private String commentUser;
}
