package com.izdebski.SpringAOPBeforeAndAfterAdviceUsingXML;

import com.izdebski.SpringAOPBeforeAndAfterAdviceUsingXML.model.Account;
import com.izdebski.SpringAOPBeforeAndAfterAdviceUsingXML.service.AccountServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringAopBeforeAndAfterAdviceUsingXmlApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringAopBeforeAndAfterAdviceUsingXmlApplication.class, args);

		ApplicationContext ctx= new ClassPathXmlApplicationContext("Beans.xml");
		AccountServiceImpl accountService = ctx.getBean("accountService", AccountServiceImpl.class);

		AccountServiceImpl.updateAccountBalance(new Account("6778888886", "Money tranfer"), 3000L);
		((AbstractApplicationContext) ctx).close();
	}
}