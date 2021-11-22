package com.izdebski.SpringBootWhitelabelErrorPageReplaceWithJSONResponse.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GepanzerteKettenfahrzeugeController {

    @RequestMapping(value="/rheinmetal", method= RequestMethod.GET)
    public String rheinmetal(){
        return "PanzerhaubitzePzH2000";
    }
}