package com.izdebski.SpringDataNamedQuery;

import com.izdebski.SpringDataNamedQuery.entity.Person;
import com.izdebski.SpringDataNamedQuery.service.PeopleManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;

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
		List<Person>list = peopleManagementService.findByLastName("Almadovar",
				new PageRequest(0, 4, Direction.ASC, "firstName"));

		list.forEach(System.out::println);
	}
}