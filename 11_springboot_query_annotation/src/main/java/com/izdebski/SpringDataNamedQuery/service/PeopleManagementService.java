package com.izdebski.SpringDataNamedQuery.service;

import java.util.List;

import com.izdebski.SpringDataNamedQuery.dao.PeopleManangementDao;
import com.izdebski.SpringDataNamedQuery.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PeopleManagementService {

    @Autowired
    private PeopleManangementDao peopleManangementDao;

    public List<Person> getPersonsInfoByLastName(String lastName) {
        return peopleManangementDao.getPeronInfoByLastName(lastName);
    }

    public List<Person> getPersonsInfoByFirstNameAndEmail(String firstName, String email) {
        return peopleManangementDao.findByFirstNameAndEmail(firstName, email);
    }
}