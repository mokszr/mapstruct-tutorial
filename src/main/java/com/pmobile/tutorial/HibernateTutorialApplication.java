package com.pmobile.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.pmobile.tutorial")
@SpringBootApplication
public class HibernateTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernateTutorialApplication.class, args);
	}
}
