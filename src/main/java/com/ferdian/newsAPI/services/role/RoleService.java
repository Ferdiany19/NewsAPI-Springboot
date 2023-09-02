package com.ferdian.newsAPI.services.role;

import org.springframework.http.ResponseEntity;

import com.ferdian.newsAPI.payloads.req.RoleRequest;

public interface RoleService {
    ResponseEntity<?> createRoleService(RoleRequest request);

    public ResponseEntity<?> getAllRolesService();
}
