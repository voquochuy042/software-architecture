package com.example.serviceuser.controller;

import com.example.serviceuser.modules.User;
import com.example.serviceuser.responsitory.UserResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    private UserResponsitory userResponsitory;

    @GetMapping("/get-all")
    public List<User> getAllUser1() {
        return userResponsitory.findAll();
    }
}
