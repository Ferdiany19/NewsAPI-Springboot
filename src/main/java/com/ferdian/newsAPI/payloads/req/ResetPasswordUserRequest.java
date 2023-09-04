package com.ferdian.newsAPI.payloads.req;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ResetPasswordUserRequest {
    @NotEmpty(message = "Username or Email cannot be empty")
    private String usernameOrEmail;
    @Size(min = 8, max = 25, message = "Password length should between 8 and 25")
    @NotEmpty(message = "Password cannot be empty")
    private String newPassword;
}
