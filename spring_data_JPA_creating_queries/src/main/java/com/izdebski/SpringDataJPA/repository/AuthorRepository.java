package com.izdebski.SpringDataJPA.repository;

import com.izdebski.SpringDataJPA.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
