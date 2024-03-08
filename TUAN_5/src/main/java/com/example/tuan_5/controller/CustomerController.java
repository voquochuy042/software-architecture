package com.example.tuan_5.controller;

import com.example.tuan_5.Repository.CusRepository;
import com.example.tuan_5.entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/orders")
public class CustomerController {

    private final CusRepository cusRepository;

    @GetMapping
    public List<Customer> getAll(){
        return (List<Customer>) cusRepository.findAll();
    }

}
