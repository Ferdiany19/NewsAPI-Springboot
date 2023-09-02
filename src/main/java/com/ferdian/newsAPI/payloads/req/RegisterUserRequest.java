package com.ferdian.newsAPI.payloads.req;

import java.util.List;
import java.util.Set;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterUserRequest {
    @NotEmpty(message = "Username cannot be empty")
    private String username;
    @NotEmpty(message = "Fullname cannot be empty")
    private String fullname;
    @NotEmpty(message = "Email cannot be empty")
    @Email(message = "This should be email format")
    private String email;
    @NotEmpty(message = "Password cannot be empty")
    @Size(min = 8, max = 25, message = "Password length should between 8 and 25")
    private String password;
    @NotEmpty(message = "Role cannot be empty")
    @NotNull
    private Set<String> role;
}
