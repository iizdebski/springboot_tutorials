package com.izdebski.SpringBootCsvDownloadAPI.repository;

import com.izdebski.SpringBootCsvDownloadAPI.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}