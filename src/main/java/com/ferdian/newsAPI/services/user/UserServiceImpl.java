package com.ferdian.newsAPI.services.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ferdian.newsAPI.configs.JwtUtil;
import com.ferdian.newsAPI.models.Article;
import com.ferdian.newsAPI.models.Category;
import com.ferdian.newsAPI.models.Role;
import com.ferdian.newsAPI.models.User;
import com.ferdian.newsAPI.payloads.req.LoginUserRequest;
import com.ferdian.newsAPI.payloads.req.RegisterUserRequest;
import com.ferdian.newsAPI.payloads.req.ResetPasswordUserRequest;
import com.ferdian.newsAPI.payloads.req.UpdateArticleRequest;
import com.ferdian.newsAPI.payloads.res.ResponseHander;
import com.ferdian.newsAPI.repositories.ArticleRepository;
import com.ferdian.newsAPI.repositories.CategoryRepository;
import com.ferdian.newsAPI.repositories.RoleRepository;
import com.ferdian.newsAPI.repositories.UserRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    ArticleRepository articleRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtUtil jwtUtil;

    @Override
    public ResponseEntity<?> registerUserService(RegisterUserRequest request, String role) {

        if (userRepository.existsByUsername(request.getUsername())) {
            throw new IllegalArgumentException("Username already registered!");
        }

        if (userRepository.existsByEmail(request.getEmail())) {
            throw new IllegalArgumentException("Email already registered!");
        }

        String strRole = (role.equals("") || Objects.isNull(role) || role.equals(null)) ? "ROLE_USER" : role;

        Role roleUser = roleRepository.findByRole(strRole);

        if (Objects.isNull(roleUser)) {
            roleUser = new Role(strRole);
            roleRepository.save(roleUser);
        }
        Set<Role> roles = new HashSet<>();
        roles.add(roleUser);

        User user = new User(request.getUsername(), request.getFullname(),
                request.getEmail(), passwordEncoder.encode(request.getPassword()));

        user.setRoles(roles);
        userRepository.save(user);

        return ResponseHander.responseData(HttpStatus.CREATED.value(), "Success Add User", user);
    }

    @Override
    public ResponseEntity<?> loginUserService(LoginUserRequest request) {
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
                request.getEmail(), request.getPassword());

        // autentikasi usernya
        Authentication authentication = authenticationManager.authenticate(usernamePasswordAuthenticationToken);

        // buatkan security context holdernya
        SecurityContextHolder.getContext().setAuthentication(authentication);

        // generate token jwt.
        // token dengan 3 bagian, header, payload dan signature

        String token = jwtUtil.createToken(request.getEmail());

        Map<String, Object> data = new HashMap<>();
        data.put("email", request.getEmail());
        data.put("token", token);

        // return ResponseHandler.responseMessage(200, "Success login!", true);
        return ResponseHander.responseData(200, "Success login!", data);
    }

    @Override
    public ResponseEntity<?> resetPasswordUserService(ResetPasswordUserRequest request) {
        if (!userRepository.existsByUsername(request.getUsernameOrEmail())
                && !userRepository.existsByEmail(request.getUsernameOrEmail())) {
            throw new EntityNotFoundException("Username or Email not found!");
        }

        // validasi newPassword dan oldPassword

        User user = userRepository.findByEmail(request.getUsernameOrEmail());

        user.setPassword(request.getNewPassword());
        userRepository.save(user);
        return ResponseHander.responseMessage(HttpStatus.OK.value(), "Password Updated Successfully", true);
    }

    @Override
    public ResponseEntity<?> getAllUsersService() {
        List<User> users = userRepository.findAll();

        return ResponseHander.responseData(HttpStatus.OK.value(), "Success", users);
    }

    @Override
    public ResponseEntity<?> updateArticlesService(UpdateArticleRequest request) {
        Article article = articleRepository.findById(request.getArticleId()).orElseThrow(() -> {
            throw new NoSuchElementException("Article is not found!");
        });

        if (!request.getTitle().isEmpty()) {
            article.setTitle(request.getTitle());
        }
        if (!request.getContent().isEmpty()) {
            article.setTitle(request.getContent());
        }

        if (request.getCategory() != null) {
            Category category = categoryRepository.findById(request.getCategory()).orElseThrow(() -> {
                throw new NoSuchElementException("Category is not found!");
            });
            article.setCategory(category);
        }

        if (!request.getUpdatedBy().equalsIgnoreCase("creator") && !request.getUpdatedBy().equalsIgnoreCase("admin")) {
            throw new IllegalArgumentException("Update article only for creator or admin!");
        }

        articleRepository.save(article);
        return ResponseHander.responseData(HttpStatus.CREATED.value(), "Success Update!", article);
    }

}
