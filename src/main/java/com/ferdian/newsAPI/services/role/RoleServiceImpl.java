package com.ferdian.newsAPI.services.role;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ferdian.newsAPI.models.Role;
import com.ferdian.newsAPI.payloads.req.RoleRequest;
import com.ferdian.newsAPI.payloads.res.ResponseHander;
import com.ferdian.newsAPI.repositories.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public ResponseEntity<?> createRoleService(RoleRequest request) {
        Role role = new Role(request.getRoleName());
        roleRepository.save(role);

        return ResponseHander.responseMessage(HttpStatus.CREATED.value(), "Success Add Role", true);

    }

    @Override
    public ResponseEntity<?> getAllRolesService() {
        List<Role> roles = roleRepository.findAll();

        return ResponseHander.responseData(HttpStatus.OK.value(), "Success Get Role Data", roles);
    }

}
