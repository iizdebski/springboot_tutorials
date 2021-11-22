package com.izdebski.SpringBootJdbcDBCP;

import com.izdebski.SpringBootJdbcDBCP.dao.EmployeeDAO;
import com.izdebski.SpringBootJdbcDBCP.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class SpringBootJdbcDBCP implements CommandLineRunner {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcDBCP.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		//createEmployee();
		getEmployeeById();
		//employeeDAO.updateEmployeeEmailById(3, "petrenko.cs2031@gamil.com");
		//employeeDAO.deleteEmployeeById(3);

		System.out.println("DataSource===" + dataSource);
	}

	private void getEmployeeById() {
		Employee employee = employeeDAO.getEmployeeById(1);
		System.out.println(employee);
	}

	private void createEmployee() {
		Employee employee = new Employee();
		employee.setEmployeeName("Petro");
		employee.setEmail("petrenko.cs2031@gamil.com");
		employee.setSalary(90000.00);
		employeeDAO.createEmployee(employee);
	}
}