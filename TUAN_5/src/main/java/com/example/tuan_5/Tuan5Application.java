package com.example.tuan_5;

import com.example.tuan_5.Repository.CusRepository;
import com.example.tuan_5.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Tuan5Application {

    public static void main(String[] args) {

        SpringApplication.run(Tuan5Application.class, args);
    }
    @Autowired
    CusRepository cusRepository;

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            for (int i = 0; i < 10; i++) {
                Customer order = Customer.builder()
                        .name("h"+i)
                        .phone(Long.parseLong("000"+i))
                        .email(i+"@gmail.com")
                        .build();
                cusRepository.save(order);
            }
        };
    }
}
