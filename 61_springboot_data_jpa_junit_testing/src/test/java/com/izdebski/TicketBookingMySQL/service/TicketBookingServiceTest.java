package com.izdebski.TicketBookingMySQL.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.izdebski.TicketBookingMySQL.dao.TicketBookingDao;
import com.izdebski.TicketBookingMySQL.entity.Ticket;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TicketBookingServiceTest {

    @Autowired
    private TicketBookingService ticketBookingService;

    @MockBean
    private TicketBookingDao ticketBookingDao;

    @Test
    //@Ignore
    public void testCreateTicket(){

        Ticket ticket = new Ticket();
        ticket.setTicketId(1);
        ticket.setPassengerName("Martin Martinez");
        ticket.setSourceStation("Lviv");
        ticket.setDestStation("Ibiza");
        ticket.setBookingDate(new Date());
        ticket.setEmail("martin.s2019@yahoo.com");

        Mockito.when(ticketBookingDao.save(ticket)).thenReturn(ticket);

        assertThat(ticketBookingService.createTicket(ticket)).isEqualTo(ticket);

    }


    @Test
    //@Ignore
    public void testGetTicketById(){
        Ticket ticket = new Ticket();
        ticket.setTicketId(1);
        ticket.setPassengerName("Raul Gonsalez");
        ticket.setSourceStation("Kyiv");
        ticket.setDestStation("Malorka");
        ticket.setBookingDate(new Date());
        ticket.setEmail("raul.s2019@yahoo.com");

        Mockito.when(ticketBookingDao.findOne(1)).thenReturn(ticket);
        assertThat(ticketBookingService.getTicketById(1)).isEqualTo(ticket);
    }

    @Test
    public void testGetAllBookedTickets(){
        Ticket ticket1 = new Ticket();
        ticket1.setPassengerName("Raul Gonsalez");
        ticket1.setSourceStation("Kyiv");
        ticket1.setDestStation("Malorka");
        ticket1.setBookingDate(new Date());
        ticket1.setEmail("raul.s2019@yahoo.com");

        Ticket ticket2 = new Ticket();
        ticket2.setPassengerName("Martin Martinez");
        ticket2.setSourceStation("Lviv");
        ticket2.setDestStation("Ibiza");
        ticket2.setBookingDate(new Date());
        ticket2.setEmail("martin.s2019@yahoo.com");

        List<Ticket> ticketList = new ArrayList<>();
        ticketList.add(ticket1);
        ticketList.add(ticket2);

        Mockito.when(ticketBookingDao.findAll()).thenReturn(ticketList);

        assertThat(ticketBookingService.getAllBookedTickets()).isEqualTo(ticketList);
    }


    @Test
    public void testDeleteTicket(){
        Ticket ticket = new Ticket();
        ticket.setTicketId(1);
        ticket.setPassengerName("Martin Martinez");
        ticket.setSourceStation("Lviv");
        ticket.setDestStation("Ibiza");
        ticket.setBookingDate(new Date());
        ticket.setEmail("martin.s2019@yahoo.com");

        Mockito.when(ticketBookingDao.findOne(1)).thenReturn(ticket);
        Mockito.when(ticketBookingDao.exists(ticket.getTicketId())).thenReturn(false);
        assertFalse(ticketBookingDao.exists(ticket.getTicketId()));
    }


    @Test
    public void testUpdateTicket(){
        Ticket ticket = new Ticket();
        ticket.setTicketId(1);
        ticket.setPassengerName("Martin Martinez");
        ticket.setSourceStation("Lviv");
        ticket.setDestStation("Ibiza");
        ticket.setBookingDate(new Date());
        ticket.setEmail("martin.s2019@yahoo.com");

        Mockito.when(ticketBookingDao.findOne(1)).thenReturn(ticket);

        ticket.setEmail("martin.r2020@gmail.com");
        Mockito.when(ticketBookingDao.save(ticket)).thenReturn(ticket);

        assertThat(ticketBookingService.updateTicket(1, "martin.s2019@gmail.com")).isEqualTo(ticket);

    }

    @Test
    public void testGetTicketByEmail(){

        Ticket ticket = new Ticket();
        ticket.setTicketId(1);
        ticket.setPassengerName("Martin Martinez");
        ticket.setSourceStation("Lviv");
        ticket.setDestStation("Ibiza");
        ticket.setBookingDate(new Date());
        ticket.setEmail("martin.s2019@gmail.com");

        Mockito.when(ticketBookingDao.findByEmail("martin.s2019@gmail.com")).thenReturn(ticket);

        assertThat(ticketBookingService.getTicketByEmail("martin.s2019@gmail.com")).isEqualTo(ticket);
    }
}