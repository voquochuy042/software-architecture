package com.example.userapi;

import com.example.userapi.Repositories.UserRepository;
import com.example.userapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserApiApplication {
    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(UserApiApplication.class, args);
    }
//    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            for (int i = 1; i<=10;i++){
                userRepository.save(new User(i, "user" + i));
            }
        };
    }
}
