package com.app.scheduler.manager;

import com.app.scheduler.manager.entities.User;
import com.app.scheduler.manager.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ManagerApplication implements CommandLineRunner {

	@Autowired
	private UserRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ManagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			repository.saveAll(
					List.of(
							new User("Nick","Zavlagas"),
							new User("Peter","Parker")
					)
			);
	}
}
