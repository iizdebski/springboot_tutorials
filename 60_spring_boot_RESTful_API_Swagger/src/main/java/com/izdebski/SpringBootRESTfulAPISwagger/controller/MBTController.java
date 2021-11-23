package com.izdebski.SpringBootRESTfulAPISwagger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MBTController {

    @RequestMapping(value="/mbt")
    public String mbt(){
        return "Type 26 Super Frigate";
    }
}