package com.izdebski.SpringBootAOPAroundAdvice;

import com.izdebski.SpringBootAOPAroundAdvice.model.Account;
import com.izdebski.SpringBootAOPAroundAdvice.service.AccountServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class SpringBootAopApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootAopApplication.class, args);
		AccountServiceImpl accountService = ctx.getBean("accountService", AccountServiceImpl.class);
		accountService.updateAccountBalance(new Account("6778888886", "Money tranfer"), 3000L);
	}
}