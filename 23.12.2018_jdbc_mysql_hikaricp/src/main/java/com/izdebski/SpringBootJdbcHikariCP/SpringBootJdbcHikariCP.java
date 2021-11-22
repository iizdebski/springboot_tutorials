package com.izdebski.SpringBootJdbcHikariCP;

import com.izdebski.SpringBootJdbcHikariCP.dao.EmployeeDAO;
import com.izdebski.SpringBootJdbcHikariCP.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class SpringBootJdbcHikariCP implements CommandLineRunner {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcHikariCP.class, args);
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