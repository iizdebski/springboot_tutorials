package com.izdebski.SpringBootSecurityInMemoryAuthentication.dao;

import com.izdebski.SpringBootSecurityInMemoryAuthentication.entity.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{

}