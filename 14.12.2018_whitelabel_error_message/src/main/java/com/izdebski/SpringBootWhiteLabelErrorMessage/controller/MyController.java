package com.izdebski.SpringBootWhiteLabelErrorMessage.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController implements ErrorController {

    private static final String PATH = "/error";
    @RequestMapping(value="/hoeing", method=RequestMethod.GET)
    public String hoeing(){
        return "BAE Systems";
    }

    @RequestMapping(value=PATH, method=RequestMethod.GET)
    public String defaultErrorMessage(){
        return "Requested Resource is not found!!!";
    }


    @Override
    public String getErrorPath() {
        return PATH;
    }
}