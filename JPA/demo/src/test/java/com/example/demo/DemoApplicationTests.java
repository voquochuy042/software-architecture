package com.example.demo;

import com.example.demo.Models.Employee;
import com.example.demo.Repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    EmployeeRepository employeeRepository;


    @Test
    public void findByCustomId(){
        System.out.println(employeeRepository.findByCustomerId(Long.valueOf(1)));
    }
    @Test
    public void findByEmail(){
        System.out.println(employeeRepository.findEmployeeByEmail("huy@gmail.com"));
    }
    @Test
    public void updateFirstName(){
        employeeRepository.updateById(Long.valueOf(1),"new name");
    }
    @Test
    public void delete(){
        employeeRepository.deleteById(Long.valueOf(1));
    }
    @Test
    public void findEmployeeByCompanyId(){
        employeeRepository.findEmployeeByCompanyId(Long.valueOf(1));
    }
}
