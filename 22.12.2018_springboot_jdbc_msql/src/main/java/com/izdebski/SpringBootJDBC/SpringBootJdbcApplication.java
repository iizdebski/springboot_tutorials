package com.izdebski.SpringBootJDBC;

import com.izdebski.SpringBootJDBC.dao.EmployeeDAO;
import com.izdebski.SpringBootJDBC.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJdbcApplication implements CommandLineRunner {

	@Autowired
	private EmployeeDAO employeeDAO;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		//createEmployee();
		getEmployeeById();
		employeeDAO.updateEmployeeEmailById(3, "petrenko.cs2031@gamil.com");
		employeeDAO.deleteEmployeeById(3);
	}

	private void getEmployeeById() {
		Employee employee = employeeDAO.getEmployeeById(3);
		System.out.println(employee);
	}

	private void cerateEmployee() {
		Employee employee = new Employee();
		employee.setEmployeeName("Petro");
		employee.setEmail("petrenko.cs2031@gamil.com");
		employee.setSalary(90000.00);
		employeeDAO.createEmployee(employee);
	}
}