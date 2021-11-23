package com.izdebski.Countries.repositories;

import com.izdebski.Countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface CountryRepository extends JpaRepository<Country, Integer> {
}
