package com.izdebski.SpringBootCsvDownloadAPI.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.izdebski.SpringBootCsvDownloadAPI.model.Customer;
import com.izdebski.SpringBootCsvDownloadAPI.repository.CustomerRepository;
import com.izdebski.SpringBootCsvDownloadAPI.util.WriteDataToCSV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CsvDownloadController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/download/customers.csv")
    public void downloadCSV(HttpServletResponse response) throws IOException{
        response.setContentType("text/csv");
        response.setHeader("Content-Disposition", "attachment; file=customers.csv");

        List<Customer> customers = (List<Customer>) customerRepository.findAll();

        // Using method 1 ->
        // WriteDataToCSV.writeDataToCsvUsingStringArray(response.getWriter(), customers);

        // Using method 2 ->
        WriteDataToCSV.writeDataToCsvWithListObjects(response.getWriter(), customers);
    }
}