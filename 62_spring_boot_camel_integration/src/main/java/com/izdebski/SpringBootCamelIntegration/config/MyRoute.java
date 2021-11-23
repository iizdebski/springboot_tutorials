package com.izdebski.SpringBootCamelIntegration.config;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:C:\\Users\\user\\IdeaProjects\\KK TUTORIALS\\SpringBootCamelIntegration\\input")
                .to("file:C:\\Users\\user\\IdeaProjects\\KK TUTORIALS\\SpringBootCamelIntegration\\output");
    }
}