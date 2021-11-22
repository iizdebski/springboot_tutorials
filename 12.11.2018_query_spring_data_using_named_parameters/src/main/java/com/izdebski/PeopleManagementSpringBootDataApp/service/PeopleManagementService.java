package com.izdebski.PeopleManagementSpringBootDataApp.service;

import java.util.List;

import com.izdebski.PeopleManagementSpringBootDataApp.dao.PeopleManangementService;
import com.izdebski.PeopleManagementSpringBootDataApp.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleManagementService {

    @Autowired
    private PeopleManangementService peopleManangementService;

    public List<Person> findByLastnameOrFirstname(String lastName, String firstName) {
        return peopleManangementService.findByLastNameOrFirstName(lastName, firstName);
    }
}