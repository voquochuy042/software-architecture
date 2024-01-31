package com.example.demo;

import com.example.demo.Models.Company;
import com.example.demo.Models.Employee;
import com.example.demo.Repositories.CompanyRepository;
import com.example.demo.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    CompanyRepository companyRepository;
//    @Bean
    CommandLineRunner commandLineRunner(){
        return (args -> {
            Company company = Company.builder()
                    .name("TNHH")
                    .build();
            companyRepository.save(company);

            // Create employees associated with the company
            Employee employee = Employee.builder()
                    .firstName("Thuc")
                    .lastName("Doan")
                    .email("nttd@gmail.com")
                    .company(company)
                    .build();
            employeeRepository.save(employee);

            Employee employee1 = Employee.builder()
                    .firstName("Quoc")
                    .lastName("Khoi")
                    .email("Khoi@gmail.com")
                    .company(company)
                    .build();
            employeeRepository.save(employee1);
        });
    }


}
