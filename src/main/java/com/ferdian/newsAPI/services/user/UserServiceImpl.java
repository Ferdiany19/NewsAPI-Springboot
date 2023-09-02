package com.ferdian.newsAPI.services.user;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ferdian.newsAPI.models.Role;
import com.ferdian.newsAPI.models.User;
import com.ferdian.newsAPI.payloads.req.RegisterUserRequest;
import com.ferdian.newsAPI.payloads.res.ResponseHander;
import com.ferdian.newsAPI.repositories.RoleRepository;
import com.ferdian.newsAPI.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Override
    public ResponseEntity<?> registerUserService(RegisterUserRequest request) {

        Role roleName = roleRepository.findByRole(request.getRole());

        User user = new User(request.getUsername(), request.getFullname(), request.getEmail(), request.getPassword(),
                request.getRole());

        userRepository.save(user);
        return ResponseHander.responseMessage(HttpStatus.CREATED.value(), "Success Add User", true);
    }

}
