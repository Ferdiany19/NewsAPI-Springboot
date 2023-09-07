package com.ferdian.newsAPI.controllers.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ferdian.newsAPI.payloads.req.RoleRequest;
import com.ferdian.newsAPI.services.role.RoleService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/admin/roles")
public class RoleController {
    @Autowired
    RoleService roleService;

    @PostMapping("/create")
    public ResponseEntity<?> createRole(@RequestBody @Valid RoleRequest request) {
        return roleService.createRoleService(request);
    }

    @GetMapping
    public ResponseEntity<?> getRoles() {
        return roleService.getAllRolesService();
    }
}
