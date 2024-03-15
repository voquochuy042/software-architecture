package com.example.serviceproduct;

import com.example.serviceproduct.modules.Product;
import com.example.serviceproduct.responsitory.ProductResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServiceProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceProductApplication.class, args);
	}
	@Autowired
	ProductResponsitory productResponsitory;
	@Bean
	CommandLineRunner commandLineRunner(){
		return args -> {
			for (int i=0;i<11;i++){
				Product p = Product.builder()
						.nameProduct("product"+i)
						.quantity(i)
						.build();
				productResponsitory.save(p);

			}
		};
	}
}
