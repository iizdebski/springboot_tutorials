package com.izdebski.SpringBootWebSSL.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(value="/welcome")
    public String rheinmetal(){
        return "MBT Revolution!!!";
    }
}