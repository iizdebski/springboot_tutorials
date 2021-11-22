package com.izdebski.SpringDataNamedQuery;

import com.izdebski.SpringDataNamedQuery.entity.Person;
import com.izdebski.SpringDataNamedQuery.service.PeopleManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringDataNamedQueryApplication implements CommandLineRunner {

	@Autowired
	private PeopleManagementService peopleManagementService;

	public static void main(String[] args) {

		SpringApplication.run(SpringDataNamedQueryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		getPersonsInfoByLastName();
		getPersonsInfoByFirstNameAndEmail();
	}

	private void getPersonsInfoByFirstNameAndEmail() {
		List<Person> personList = peopleManagementService.getPersonsInfoByFirstNameAndEmail("Barry","barry.j2007@Gmail.com");
		personList.forEach(System.out::println);

	}

	private void getPersonsInfoByLastName() {
		List<Person> personList = peopleManagementService.getPersonsInfoByLastName("Murphy");
		personList.forEach(System.out::println);
	}
}