package com.ferdian.newsAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ferdian.newsAPI.models.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(String role);
}
