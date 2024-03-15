package com.example.serviceuser;

import com.example.serviceuser.modules.User;
import com.example.serviceuser.responsitory.UserResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServiceUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceUserApplication.class, args);
	}
	@Autowired
	UserResponsitory userResponsitory;

	@Bean
	CommandLineRunner commandLineRunner(){
		return args -> {
			for (int i=0;i<11;i++){
				User u = User.builder()
						.name("h"+i)
						.build();
				userResponsitory.save(u);
			}
		}
		;
	}
}
