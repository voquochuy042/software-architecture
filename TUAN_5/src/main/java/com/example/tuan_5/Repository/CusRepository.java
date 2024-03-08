package com.example.tuan_5.Repository;

import com.example.tuan_5.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CusRepository extends CrudRepository<Customer,Long> {
}
