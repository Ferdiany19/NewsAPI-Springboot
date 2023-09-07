package com.ferdian.newsAPI.models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;

    @Column(unique = true)
    private String role;

    // @JsonIgnore
    // @ManyToMany(mappedBy = "roles")
    // private Set<User> users = new HashSet<>();

    // public Role(String role, List<User> users) {
    // this.role = role;
    // this.users = users;
    // }

    public Role(String role) {
        this.role = role;
    }

}
