package com.ferdian.newsAPI.services.user;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ferdian.newsAPI.models.Role;
import com.ferdian.newsAPI.models.User;
import com.ferdian.newsAPI.payloads.req.LoginUserRequest;
import com.ferdian.newsAPI.payloads.req.RegisterUserRequest;
import com.ferdian.newsAPI.payloads.req.ResetPasswordUserRequest;
import com.ferdian.newsAPI.payloads.res.ResponseHander;
import com.ferdian.newsAPI.repositories.RoleRepository;
import com.ferdian.newsAPI.repositories.UserRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Override
    public ResponseEntity<?> registerUserService(RegisterUserRequest request) {

        if (userRepository.existsByUsername(request.getUsername())) {
            throw new IllegalArgumentException("Username already registered!");
        }

        if (userRepository.existsByEmail(request.getEmail())) {
            throw new IllegalArgumentException("Email already registered!");
        }

        Role role = roleRepository.findById(request.getRole()).orElseThrow(() -> {
            throw new EntityNotFoundException("Role is not found!");
        });

        User user = new User(request.getUsername(), request.getFullname(), request.getEmail(), request.getPassword(),
                role);

        userRepository.save(user);

        return ResponseHander.responseMessage(HttpStatus.CREATED.value(), "Success Add User", true);
    }

    @Override
    public ResponseEntity<?> loginUserService(LoginUserRequest request) {
        if (!userRepository.existsByUsername(request.getUsernameOrEmail())
                && !userRepository.existsByEmail(request.getUsernameOrEmail())) {
            throw new EntityNotFoundException("Username or Email not found!");
        }

        if (!userRepository.existsByPassword(request.getPassword())) {
            throw new EntityNotFoundException("Password invalid!");
        }
        return ResponseHander.responseMessage(HttpStatus.OK.value(), "Login Success", true);
    }

    @Override
    public ResponseEntity<?> resetPasswordUserService(ResetPasswordUserRequest request) {
        if (!userRepository.existsByUsername(request.getUsernameOrEmail())
                && !userRepository.existsByEmail(request.getUsernameOrEmail())) {
            throw new EntityNotFoundException("Username or Email not found!");
        }

        User user = userRepository.findByUsernameOrEmail(request.getUsernameOrEmail(), request.getUsernameOrEmail());

        user.setPassword(request.getNewPassword());
        userRepository.save(user);
        return ResponseHander.responseMessage(HttpStatus.OK.value(), "Password Updated Successfully", true);
    }

    @Override
    public ResponseEntity<?> getAllUsersService() {
        List<User> users = userRepository.findAll();

        return ResponseHander.responseData(HttpStatus.OK.value(), "Success", users);
    }

}
