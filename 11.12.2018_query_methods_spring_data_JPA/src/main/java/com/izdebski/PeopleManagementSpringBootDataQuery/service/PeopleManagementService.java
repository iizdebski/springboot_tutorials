package com.izdebski.PeopleManagementSpringBootDataQuery.service;

import com.izdebski.PeopleManagementSpringBootDataQuery.dao.PeopleManangementDao;
import com.izdebski.PeopleManagementSpringBootDataQuery.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleManagementService {

    @Autowired
    private PeopleManangementDao peopleManangementDao;

    public List<Person> getPersonsInfoByLastName(String lastName) {
        return peopleManangementDao.findByLastName(lastName);
    }

    public List<Person> getPersonsInfoByFirstNameAndEmail(String firstName, String email) {
        return peopleManangementDao.findByFirstNameAndEmail(firstName, email);
    }
}