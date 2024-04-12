package com.example.retry.controller;

import com.example.retry.Service.UserService;
import com.example.retry.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class Controller {
    @Autowired
    private UserService userService;

    @PostMapping(value = "/create-user")
    public User createUser(User user){
        return userService.saveUser(user);

    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getID(@PathVariable Long id){
        User user = userService.findById(id);
        return ResponseEntity.ok(user+"");
    }

}

