package com.izdebski.SpringBootCommandLineRunner.service;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceProvider {

    public String message(){
        return "MBT Revolution!!!";
    }
}