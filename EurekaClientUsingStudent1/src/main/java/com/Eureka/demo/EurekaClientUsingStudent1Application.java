package com.Eureka.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients(basePackages="com.Eureka.demo")
@SpringBootApplication
public class EurekaClientUsingStudent1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientUsingStudent1Application.class, args);
	}

}
