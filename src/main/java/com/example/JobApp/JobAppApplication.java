package com.example.JobApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobAppApplication {

	public static void main(String[] args) {

        SpringApplication.run(JobAppApplication.class, args);
        System.out.println("Server started...");
	}

}
