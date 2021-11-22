package com.izdebski.PeopleManagementSpringBootDataApp;

import java.util.List;

import com.izdebski.PeopleManagementSpringBootDataApp.entity.Person;
import com.izdebski.PeopleManagementSpringBootDataApp.service.PeopleManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class PeopleManagementSpringBootDataAppApplication implements CommandLineRunner{

	@Autowired
	private PeopleManagementService peopleManagementService;

	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementSpringBootDataAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Person>list = peopleManagementService.findByLastnameOrFirstname("Sparrow", "Jack");
		list.forEach(System.out::println);
	}
}