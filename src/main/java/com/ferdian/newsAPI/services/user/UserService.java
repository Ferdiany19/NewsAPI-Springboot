package com.ferdian.newsAPI.services.user;

import org.springframework.http.ResponseEntity;

import com.ferdian.newsAPI.payloads.req.LoginUserRequest;
import com.ferdian.newsAPI.payloads.req.RegisterUserRequest;
import com.ferdian.newsAPI.payloads.req.ResetPasswordUserRequest;

public interface UserService {
    ResponseEntity<?> registerUserService(RegisterUserRequest request);

    ResponseEntity<?> loginUserService(LoginUserRequest request);

    ResponseEntity<?> resetPasswordUserService(ResetPasswordUserRequest request);

    ResponseEntity<?> getAllUsersService();
}
