package com.ferdian.newsAPI.services.user;

import org.springframework.http.ResponseEntity;

import com.ferdian.newsAPI.payloads.req.LoginUserRequest;
import com.ferdian.newsAPI.payloads.req.RegisterUserRequest;
import com.ferdian.newsAPI.payloads.req.ResetPasswordUserRequest;
import com.ferdian.newsAPI.payloads.req.UpdateArticleRequest;

public interface UserService {
    ResponseEntity<?> registerUserService(RegisterUserRequest request, String role);

    ResponseEntity<?> loginUserService(LoginUserRequest request);

    ResponseEntity<?> resetPasswordUserService(ResetPasswordUserRequest request);

    ResponseEntity<?> getAllUsersService();

    ResponseEntity<?> updateArticlesService(UpdateArticleRequest request);
}
