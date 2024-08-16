package com.javalearning.newwebproject.dto;

import com.javalearning.newwebproject.models.Task;

public record UserDTO(String username, String password, String firstName, String lastName, String email, String phone, Task task) {
}
