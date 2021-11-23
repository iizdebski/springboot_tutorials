package com.izdebski.SpringBootFlywayIntegration;

import com.izdebski.SpringBootFlywayIntegration.entity.Employee;
import com.izdebski.SpringBootFlywayIntegration.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFlywayIntegrationApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFlywayIntegrationApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Employee employee = getEmployee();
		employeeRepository.save(employee);
	}

	private Employee getEmployee() {
		Employee employee = new Employee();
		employee.setEmployeeName("Sean Murphy");
		employee.setEmail("sean.m@gmail.com");
		employee.setSalary(90000.00);
		return employee;
	}
}