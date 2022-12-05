package com.learningpath;

import com.learningpath.model.Role;
import com.learningpath.model.User;
import com.learningpath.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class LearningPathApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningPathApplication.class, args);
	}

	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

			userService.saveUser(new User(null, "John XYZ", "john", "john@example.com","1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Will Smith", "will", "will@example.com","1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Jim Carrey", "jim", "jim@example.com","1234", new ArrayList<>()));

			userService.addRoleToUser("john", "ROLE_USER");
			userService.addRoleToUser("will", "ROLE_MANAGER");
			userService.addRoleToUser("john", "ROLE_ADMIN");

		};
	}
}
