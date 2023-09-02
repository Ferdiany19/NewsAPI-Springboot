package com.ferdian.newsAPI.payloads.req;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class RoleRequest {
    @NotEmpty(message = "role name cannot be empty")
    private String roleName;
}
