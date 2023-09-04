package com.ferdian.newsAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ferdian.newsAPI.payloads.req.LoginUserRequest;
import com.ferdian.newsAPI.payloads.req.RegisterUserRequest;
import com.ferdian.newsAPI.payloads.req.ResetPasswordUserRequest;
import com.ferdian.newsAPI.services.user.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody @Valid RegisterUserRequest request) {
        return userService.registerUserService(request);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody @Valid LoginUserRequest request) {
        return userService.loginUserService(request);
    }

    @PostMapping("/reset")
    public ResponseEntity<?> resePasswordUser(@RequestBody @Valid ResetPasswordUserRequest request) {
        return userService.resetPasswordUserService(request);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllUsers() {
        return userService.getAllUsersService();
    }
}
