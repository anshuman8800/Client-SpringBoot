package com.e.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ClientApplication.class, args);
		System.out.println("Welcome to boot...");
		Alien alien1 = context.getBean(Alien.class);
		alien1.setId("12345");
		System.out.println(alien1);
		alien1.show();

		Alien alien2 = context.getBean(Alien.class);
		alien2.setId("newId");
		alien2.show();
		System.out.println("new alian is " + alien2);
	}

}
