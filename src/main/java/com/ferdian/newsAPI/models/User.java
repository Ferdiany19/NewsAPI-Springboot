package com.ferdian.newsAPI.models;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.UuidGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @UuidGenerator
    private String userId;

    @Column(length = 25, nullable = false, unique = true, updatable = true)
    private String username;

    @Column(length = 25, nullable = false)
    private String fullname;

    @Column(length = 100)
    private String email;

    @JsonIgnore
    @Column(length = 100)
    private String password;

    @ManyToMany
    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
    // @JoinColumn(name = "role_id")
    private Set<Role> roles = new HashSet<>();

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public User(String username, String fullname, String email, String password, Set<Role> roles) {
        this.username = username;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    // public User(String username, String fullname, String email, String password,
    // Set<Role> roleId) {
    // this.username = username;
    // this.fullname = fullname;
    // this.email = email;
    // this.password = password;
    // this.roleId = roleId;
    // }

}
