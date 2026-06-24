package com.Eureka.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaStudentClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaStudentClientApplication.class, args);
	}

}
