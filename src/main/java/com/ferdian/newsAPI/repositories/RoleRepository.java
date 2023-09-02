package com.ferdian.newsAPI.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ferdian.newsAPI.models.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByRole(String role);
}
