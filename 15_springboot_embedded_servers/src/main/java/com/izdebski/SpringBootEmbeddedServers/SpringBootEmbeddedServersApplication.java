package com.izdebski.SpringBootEmbeddedServers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootEmbeddedServersApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootEmbeddedServersApplication.class, args);
	}
}

@RestController
class MyRestController{

	@GetMapping("/")
	public String welcome(){
	return "Sweet Georgia Brown!!!";
	}
}