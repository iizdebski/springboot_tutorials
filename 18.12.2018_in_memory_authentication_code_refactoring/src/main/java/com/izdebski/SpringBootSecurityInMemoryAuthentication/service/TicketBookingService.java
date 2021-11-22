package com.izdebski.SpringBootSecurityInMemoryAuthentication.service;

import com.izdebski.SpringBootSecurityInMemoryAuthentication.dao.TicketBookingDao;
import com.izdebski.SpringBootSecurityInMemoryAuthentication.entity.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketBookingService {

    @Autowired
    private TicketBookingDao ticketBookingDao;

    public Ticket getTicketById(Integer ticketId) {
        return ticketBookingDao.findOne(ticketId);
    }
    public Iterable<Ticket> getAllBookedTickets() {
        return ticketBookingDao.findAll();
    }
}