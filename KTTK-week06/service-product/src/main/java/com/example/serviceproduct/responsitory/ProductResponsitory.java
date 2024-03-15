package com.example.serviceproduct.responsitory;

import com.example.serviceproduct.modules.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductResponsitory extends JpaRepository<Product,Long> {
}
