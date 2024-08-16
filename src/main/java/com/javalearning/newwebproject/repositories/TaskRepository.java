package com.javalearning.newwebproject.repositories;

import com.javalearning.newwebproject.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
