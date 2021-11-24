package com.izdebski.PeopleManagementSpringBootDataQuery.dao;

import com.izdebski.PeopleManagementSpringBootDataQuery.entity.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PeopleManangementDao extends CrudRepository<Person, Integer> {
    List<Person> findByLastName(String lastName);
    List<Person> findByFirstNameAndEmail(String firstName,String email);
}