package com.ferdian.newsAPI.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ferdian.newsAPI.models.User;

public interface UserRepository extends JpaRepository<User, String> {
    // @Query(value = "insert into users (username, fullname, email, password)
    // values ((:usr), (:full), (:em), (:p));"
    // +
    // "insert into users_roles (user_id, role_id) " +
    // "values (select user_id from users where username = (:usr), " +
    // " (select role_id from roles where role = 'USER'))")
    // User signUpWithuserRole(@Param("usr") String username, @Param("full") String
    // fullname,
    // @Param("em") String email,
    // @Param("p") String password);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    Boolean existsByPassword(String password);

    Optional<User> findByUsername(String username);

    User findByEmail(String email);

    User findByUsernameOrEmail(String username, String email);

    @Query(value = "SELECT username, fullname, email FROM users", nativeQuery = true)
    List<User> getAllUser();

}
