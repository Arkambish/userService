package com.arkam.microservices.user_service.repo;

import com.arkam.microservices.user_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail (String email);
    Optional<User> findByEmail (String email);
    Optional<User> findById(Long userId);
}
