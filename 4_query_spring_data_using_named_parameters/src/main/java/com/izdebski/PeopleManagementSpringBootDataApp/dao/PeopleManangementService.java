package com.izdebski.PeopleManagementSpringBootDataApp.dao;

import java.util.List;

import com.izdebski.PeopleManagementSpringBootDataApp.entity.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface PeopleManangementService extends CrudRepository<Person, Integer>{

    @Query("SELECT p FROM Person p WHERE p.firstName=:firstname Or p.lastName=:lastname")
    List<Person> findByLastNameOrFirstName(@Param("lastname")String lastName,@Param("firstname") String firstName);
}