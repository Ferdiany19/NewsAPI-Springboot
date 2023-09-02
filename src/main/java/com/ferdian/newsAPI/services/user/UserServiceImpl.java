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

        Set<Role> roles = new HashSet<>();
        for (String roleName : request.getRole()) {
            Role role = roleRepository.findByRole(roleName);
            if (role != null) {
                roles.add(role);
            } else {
                throw new EntityNotFoundException("Role Not Found");
            }
        }

        User user = new User(request.getUsername(), request.getFullname(), request.getEmail(), request.getPassword(),
                roles);
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

}
