package com.izdebski.SpringBootHibernateJPADatabaseInitialization.repository;

import com.izdebski.SpringBootHibernateJPADatabaseInitialization.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}