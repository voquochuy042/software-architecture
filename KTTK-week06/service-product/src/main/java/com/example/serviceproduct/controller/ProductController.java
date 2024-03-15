package com.example.serviceproduct.controller;

import com.example.serviceproduct.modules.Product;
import com.example.serviceproduct.responsitory.ProductResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/product")
@RestController
public class ProductController {

    @Autowired
    private ProductResponsitory productResponsitory;

    @GetMapping("/get-all")
    public List<Product> getAllProduct(){
        return productResponsitory.findAll();
    }
}
