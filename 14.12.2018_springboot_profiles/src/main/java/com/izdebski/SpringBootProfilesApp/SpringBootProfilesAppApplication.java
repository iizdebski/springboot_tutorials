package com.izdebski.SpringBootProfilesApp;

import com.izdebski.SpringBootProfilesApp.config.EnvBasedConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class SpringBootProfilesAppApplication implements CommandLineRunner{

	@Autowired
	private DataSource dataSource;

	@Autowired
	private EnvBasedConfig envBasedConfig;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfilesAppApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("-------------------------------------");
		System.out.println("DataSource="+dataSource);

		System.out.println("-------------------------------------");

		envBasedConfig.setup();
	}
}