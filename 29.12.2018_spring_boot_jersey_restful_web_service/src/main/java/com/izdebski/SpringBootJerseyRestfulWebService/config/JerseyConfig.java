package com.izdebski.SpringBootJerseyRestfulWebService.config;

import com.izdebski.SpringBootJerseyRestfulWebService.service.UserRestService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;


@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(UserRestService.class);
    }
}