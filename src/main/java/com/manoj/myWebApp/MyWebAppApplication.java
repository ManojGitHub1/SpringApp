package com.manoj.myWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyWebAppApplication {

	/*
	Client <=> Server((Front Controller)-Controller, Service, Repository) <=> Database
	*/

	public static void main(String[] args) {
		SpringApplication.run(MyWebAppApplication.class, args);
	}

}
