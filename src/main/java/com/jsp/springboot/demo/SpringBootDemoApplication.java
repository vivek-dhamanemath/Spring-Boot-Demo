package com.jsp.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
		System.out.println("Hello Welcome to SpringBoot");
		
		// Invoking Spring Bean Container.
		// Reading all the configuration details from the properties.
	}

}

// @SpringBootApplication annotation will do the same work as of following 3 annotation combinedly.
//@Configuration, @ComponentScan @EnableAutoConfiguration