package com.izdebski.SpringDataNamedQuery.dao;

import java.util.List;

import com.izdebski.SpringDataNamedQuery.entity.Person;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;


public interface PeopleManangementDao extends CrudRepository<Person, Integer>{

    List<Person> findByLastName(String lastName, Pageable pageable);
}