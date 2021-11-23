package com.izdebski.TicketBookingMySQL.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.izdebski.TicketBookingMySQL.entity.Ticket;
import com.izdebski.TicketBookingMySQL.service.TicketBookingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@WebMvcTest(value=TicketBookingController.class,secure = false)
public class TicketBookingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private TicketBookingService ticketBookingService;

    @Test
    public void testCreateTicket() throws Exception {

        Ticket mockTicket = new Ticket();
        mockTicket.setTicketId(1);
        mockTicket.setPassengerName("Martin Martinez");
        mockTicket.setSourceStation("Lviv");
        mockTicket.setDestStation("Ibiza");
        mockTicket.setBookingDate(new Date());
        mockTicket.setEmail("martin.s2019@yahoo.com");

        String inputInJson = this.mapToJson(mockTicket);

        String URI = "/api/tickets/create";

        Mockito.when(ticketBookingService.createTicket(Mockito.any(Ticket.class))).thenReturn(mockTicket);

        RequestBuilder requestBuilder = post(URI)
                .accept(MediaType.APPLICATION_JSON).content(inputInJson)
                .contentType(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        MockHttpServletResponse response = result.getResponse();

        String outputInJson = response.getContentAsString();

        assertThat(outputInJson).isEqualTo(inputInJson);
        assertEquals(HttpStatus.OK.value(), response.getStatus());
    }

    @Test
    public void testGetTicketById() throws Exception {
        Ticket mockTicket = new Ticket();
        mockTicket.setTicketId(1);
        mockTicket.setPassengerName("Martin Martinez");
        mockTicket.setSourceStation("Lviv");
        mockTicket.setDestStation("Ibiza");
        mockTicket.setBookingDate(new Date());
        mockTicket.setEmail("martin.s2019@yahoo.com");

        Mockito.when(ticketBookingService.getTicketById(Mockito.anyInt())).thenReturn(mockTicket);

        String URI = "/api/tickets/ticketId/1";
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                URI).accept(
                MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        String expectedJson = this.mapToJson(mockTicket);
        String outputInJson = result.getResponse().getContentAsString();
        assertThat(outputInJson).isEqualTo(expectedJson);
    }

    @Test
    public void testGetTicketByEmail() throws Exception {
        Ticket mockTicket = new Ticket();
        mockTicket.setTicketId(1);
        mockTicket.setPassengerName("Martin Bingel");
        mockTicket.setSourceStation("Kolkata");
        mockTicket.setDestStation("Delhi");
        mockTicket.setBookingDate(new Date());
        mockTicket.setEmail("martin.s2017@gmail.com");

        String expectedJson = this.mapToJson(mockTicket);

        Mockito.when(ticketBookingService.getTicketByEmail(Mockito.anyString())).thenReturn(mockTicket);

        String URI = "/api/tickets/email/martin.s2017@gmail.com";
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                URI).accept(
                MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        String outputInJson = result.getResponse().getContentAsString();
        assertThat(outputInJson).isEqualTo(expectedJson);

    }

    @Test
    public void testGetAllBookedTickets() throws Exception {

        Ticket mockTicket1 = new Ticket();
        mockTicket1.setTicketId(1);
        mockTicket1.setPassengerName("Martin Martinez");
        mockTicket1.setSourceStation("Lviv");
        mockTicket1.setDestStation("Ibiza");
        mockTicket1.setBookingDate(new Date());
        mockTicket1.setEmail("martin.s2019@yahoo.com");

        Ticket mockTicket2 = new Ticket();
        mockTicket2.setPassengerName("Martin Martinez");
        mockTicket2.setSourceStation("Lviv");
        mockTicket2.setDestStation("Ibiza");
        mockTicket2.setBookingDate(new Date());
        mockTicket2.setEmail("martin.s2019@yahoo.com");

        List<Ticket> ticketList = new ArrayList<>();
        ticketList.add(mockTicket1);
        ticketList.add(mockTicket2);

        Mockito.when(ticketBookingService.getAllBookedTickets()).thenReturn(ticketList);

        String URI = "/api/tickets/alltickets";
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                URI).accept(
                MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

        String expectedJson = this.mapToJson(ticketList);
        String outputInJson = result.getResponse().getContentAsString();
        assertThat(outputInJson).isEqualTo(expectedJson);
    }

    @Test
    public void testUpdateTicketByEmail() throws Exception {

        Ticket mockTicket = new Ticket();
        mockTicket.setTicketId(1);
        mockTicket.setPassengerName("Martin Martinez");
        mockTicket.setSourceStation("Lviv");
        mockTicket.setDestStation("Ibiza");
        mockTicket.setBookingDate(new Date());
        mockTicket.setEmail("martin.s2019@yahoo.com");

        String inputInJson = this.mapToJson(mockTicket);

        String uri = "/api/tickets/ticketId/1/email/barry.s2000@infotech.com";

        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.put(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(inputInJson)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
    }


    @Test
    public void testDeleteTicketById() throws Exception {
        Ticket mockTicket = new Ticket();
        mockTicket.setTicketId(1);
        mockTicket.setPassengerName("Martin Martinez");
        mockTicket.setSourceStation("Lviv");
        mockTicket.setDestStation("Ibiza");
        mockTicket.setBookingDate(new Date());
        mockTicket.setEmail("martin.s2019@yahoo.com");

        String uri = "/api/tickets/ticketId/1";
        MvcResult mvcResult = mockMvc.perform(delete(uri)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
    }

        /**
     * Maps an Object into a JSON String. Uses a Jackson ObjectMapper.
     */
    private String mapToJson(Object object) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(object);
    }
}