package com.example.SpringBootWithXML.controller;

import com.example.SpringBootWithXML.service.MessageProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageProviderController {

    @Autowired
    private MessageProviderService messageProviderService;

    public void setMessageProviderService(MessageProviderService messageProviderService) {
        this.messageProviderService = messageProviderService;
    }

    @GetMapping("/")
    public String rheinmetal(){
        return messageProviderService.getMessage();
    }
}