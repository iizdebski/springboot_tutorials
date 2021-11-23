package com.izdebski.SpringBootCsvDownloadAPI;

import com.izdebski.SpringBootCsvDownloadAPI.model.Customer;
import com.izdebski.SpringBootCsvDownloadAPI.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringBootCsvDownloadApiApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCsvDownloadApiApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

		if(repository.count() == 0) {
			// save a list of Customers
			repository.saveAll(Arrays.asList(new Customer("Jack", "Smith"),
					new Customer("Adam", "Johnson"),
					new Customer("Kim", "Smith"),
					new Customer("David", "Williams"),
					new Customer("Peter", "Davis")));
		}
	}
}