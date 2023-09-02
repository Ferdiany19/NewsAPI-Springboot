package com.ferdian.newsAPI.services.user;

import org.springframework.http.ResponseEntity;

import com.ferdian.newsAPI.payloads.req.RegisterUserRequest;

public interface UserService {
    ResponseEntity<?> registerUserService(RegisterUserRequest request);
}
