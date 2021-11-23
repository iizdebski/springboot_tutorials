package com.izdebski.SpringBootJerseyWebserviceMySql.config;

import com.izdebski.SpringBootJerseyWebserviceMySql.endpoint.TopicJerseyRestService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(TopicJerseyRestService.class);
    }
}