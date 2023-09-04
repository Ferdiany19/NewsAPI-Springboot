package com.ferdian.newsAPI.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ferdian.newsAPI.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(String role);

    @Query(value = "SELECT * FROM roles", nativeQuery = true)
    List<Role> getAllRole();
}
