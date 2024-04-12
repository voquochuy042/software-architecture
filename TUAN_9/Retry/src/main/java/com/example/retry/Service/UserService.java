package com.example.retry.Service;

import com.example.retry.models.User;
import com.example.retry.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User saveUser(User user){
        return repository.save(user);
    }

    public User findById(Long id){
        return repository.findById(id).get();
    }
}
