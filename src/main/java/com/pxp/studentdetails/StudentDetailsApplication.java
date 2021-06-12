package com.pxp.studentdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StudentDetailsApplication {

	public static void main(String[] args) {
		System.out.println("");
		SpringApplication.run(StudentDetailsApplication.class, args);
	}

}
