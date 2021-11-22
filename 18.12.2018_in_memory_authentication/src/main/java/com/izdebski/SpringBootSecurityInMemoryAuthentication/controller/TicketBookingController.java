package com.izdebski.SpringBootSecurityInMemoryAuthentication.controller;

import com.izdebski.SpringBootSecurityInMemoryAuthentication.entity.Ticket;
import com.izdebski.SpringBootSecurityInMemoryAuthentication.service.TicketBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class TicketBookingController {

    @Autowired
    private TicketBookingService ticketBookingService;

    @GetMapping(value="/tickets/ticketId/{ticketId}")
    public Ticket getTicketById(@PathVariable("ticketId")Integer ticketId){
        return ticketBookingService.getTicketById(ticketId);
    }
    @GetMapping(value="/admin/tickets/alltickets")
    public Iterable<Ticket> getAllBookedTickets(){
        return ticketBookingService.getAllBookedTickets();
    }
}