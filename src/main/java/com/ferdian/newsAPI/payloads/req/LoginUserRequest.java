package com.ferdian.newsAPI.payloads.req;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class LoginUserRequest {
    @NotEmpty(message = "Username or Email cannot be empty")
    private String usernameOrEmail;
    @NotEmpty(message = "Password cannot be empty")
    private String password;
}
