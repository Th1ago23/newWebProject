package com.javalearning.newwebproject.repositories;

import com.javalearning.newwebproject.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
