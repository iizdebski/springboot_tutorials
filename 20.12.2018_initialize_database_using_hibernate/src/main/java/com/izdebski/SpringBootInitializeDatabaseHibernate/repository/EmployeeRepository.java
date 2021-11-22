package com.izdebski.SpringBootInitializeDatabaseHibernate.repository;

import com.izdebski.SpringBootInitializeDatabaseHibernate.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}