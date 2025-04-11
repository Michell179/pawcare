package com.pawcare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class PawcareApplication {

	public static void main(String[] args) {
		SpringApplication.run(PawcareApplication.class, args);
	}

}
