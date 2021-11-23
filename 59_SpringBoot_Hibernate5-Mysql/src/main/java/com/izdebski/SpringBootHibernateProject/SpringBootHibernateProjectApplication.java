package com.izdebski.SpringBootHibernateProject;

import com.izdebski.SpringBootHibernateProject.dao.EmployeeDao;
import com.izdebski.SpringBootHibernateProject.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringBootHibernateProjectApplication implements CommandLineRunner {

	@Autowired
	private EmployeeDao employeeDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = getEmployee();
		employeeDao.createEmployee(employee);
	}
	private Employee getEmployee(){
		Employee employee = new Employee();
		employee.setName("Peter Murphy");
		employee.setSalary(80000.00);
		employee.setDoj(new Date());
		return employee;
	}
}