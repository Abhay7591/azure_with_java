package com.abhay.azureabhay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.Optional;

@SpringBootApplication
public class AzureabhayApplication implements CommandLineRunner {

	@Autowired
	private UserRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AzureabhayApplication.class, args);
	}

	public void run(String... var1) throws Exception {
		final User testUser = new User("testId", "Abhay", "Meshram");

		repository.deleteAll();
		repository.save(testUser);
	//	final Optional<User> result =repository.findById(testUser.getId());

		//final User result = repository.findOne(testUser.getId());

	//	System.out.printf("\n\n%s\n\n",result.toString());
	}
}