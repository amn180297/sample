package com.cg.spring.plpmod20;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.cg.spring.plpmod20")
public class Plpmod20Application {

	public static void main(String[] args) {
		SpringApplication.run(Plpmod20Application.class, args);
	}
}
