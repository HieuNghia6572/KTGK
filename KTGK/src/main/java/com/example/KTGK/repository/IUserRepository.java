package com.example.KTGK.repository;

import com.example.KTGK.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u Where u.username = ?1")
    User findByUsername(String username);
}
