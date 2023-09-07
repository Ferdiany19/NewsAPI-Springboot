package com.ferdian.newsAPI.payloads.req;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class LoginUserRequest {
    @NotEmpty(message = "Email cannot be empty")
    private String email;
    @NotEmpty(message = "Password cannot be empty")
    private String password;
}
