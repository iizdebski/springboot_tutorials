package com.izdebski.SpringBootChangeServerPortWebApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @GetMapping("/")
    public String welcome(){
        return "MBT Revolution!!!";
    }
}