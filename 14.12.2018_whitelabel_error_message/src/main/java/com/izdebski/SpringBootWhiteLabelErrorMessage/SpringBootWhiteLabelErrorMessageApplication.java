package com.izdebski.SpringBootWhiteLabelErrorMessage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.izdebski.SpringBootWhiteLabelErrorMessage.controller"})
public class SpringBootWhiteLabelErrorMessageApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWhiteLabelErrorMessageApplication.class, args);
	}

}

