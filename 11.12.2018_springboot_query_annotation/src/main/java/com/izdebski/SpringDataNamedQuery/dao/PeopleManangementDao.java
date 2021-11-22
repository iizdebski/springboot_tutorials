package com.izdebski.SpringDataNamedQuery.dao;

import java.util.List;

import com.izdebski.SpringDataNamedQuery.entity.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface PeopleManangementDao extends CrudRepository<Person, Integer>{

    @Query(value = "SELECT*FROM persons_table WHERE last_name=?1",nativeQuery = true)
    List<Person> getPeronInfoByLastName(String lastName);

    @Query(value="SELECT*FROM persons_table WHERE first_name=?1 AND email=?2", nativeQuery = true)
    List<Person> findByFirstNameAndEmail(String firstName,String email);
}