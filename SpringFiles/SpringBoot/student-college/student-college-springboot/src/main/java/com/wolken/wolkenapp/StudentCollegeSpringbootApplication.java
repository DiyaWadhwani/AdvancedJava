package com.wolken.wolkenapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentCollegeSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentCollegeSpringbootApplication.class, args);
		
		System.out.println("\nColleges are going into LOCKDOWN !");
	}

}
