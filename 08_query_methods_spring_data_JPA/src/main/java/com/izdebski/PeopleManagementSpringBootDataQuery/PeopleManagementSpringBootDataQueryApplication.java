package com.izdebski.PeopleManagementSpringBootDataQuery;

import com.izdebski.PeopleManagementSpringBootDataQuery.entity.Person;
import com.izdebski.PeopleManagementSpringBootDataQuery.service.PeopleManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class PeopleManagementSpringBootDataQueryApplication implements CommandLineRunner {

	@Autowired
	private PeopleManagementService peopleManagementService;

	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementSpringBootDataQueryApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		getPersonsInfoByLastName();
		getPersonsInfoByFirstNameAndEmail();
	}

	private void getPersonsInfoByLastName() {
		List<Person> personList = peopleManagementService.getPersonsInfoByLastName("Murphy");
		personList.forEach(System.out::println);

	}

	private void getPersonsInfoByFirstNameAndEmail() {
		List<Person> personList = peopleManagementService.getPersonsInfoByFirstNameAndEmail("Barry","barry.j2007@Gmail.com");
		personList.forEach(System.out::println);
	}
}