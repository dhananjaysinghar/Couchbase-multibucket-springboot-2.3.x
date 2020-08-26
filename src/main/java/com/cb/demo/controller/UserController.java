package com.cb.demo.controller;

import com.cb.demo.model.User;
import com.cb.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping
    public String saveUser(@RequestBody User user) {
        userRepo.save(user);
        return "user saved successfully";
    }

    @GetMapping
    public List<User> getUsers() {
        return userRepo.findAll();
    }
}
