package com.example.userapi.Controllers;

import com.example.userapi.Repositories.UserRepository;
import com.example.userapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;
    @GetMapping("/users")
    public List<User> getAll(){
        return userRepository.findAll();
    }
    @GetMapping("/users/{id}")
    public Optional<User> getById(@PathVariable("id") long id){
        return userRepository.findById(id);
    }
}
