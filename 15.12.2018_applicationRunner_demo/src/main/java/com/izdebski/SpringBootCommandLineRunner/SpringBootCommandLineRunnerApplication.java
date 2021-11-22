package com.izdebski.SpringBootCommandLineRunner;

import com.izdebski.SpringBootCommandLineRunner.service.MessageServiceProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootCommandLineRunnerApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootCommandLineRunnerApplication.class, args);
		MessageServiceProvider messageServiceProvider = ctx.getBean(MessageServiceProvider.class);

		String message = messageServiceProvider.message();
		System.out.println(message);
	}
}