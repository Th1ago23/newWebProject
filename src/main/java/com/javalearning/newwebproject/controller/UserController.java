package com.javalearning.newwebproject.controller;

import com.javalearning.newwebproject.models.User;
import com.javalearning.newwebproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("users")
public class UserController {
    @Autowired
    private UserRepository userRepository;;

    @PostMapping
    public void register(@RequestBody User user) {
        userRepository.save(user);
    }

    @GetMapping
    public void getAll(){
        List<User> userList = userRepository.findAll();
    }

}
