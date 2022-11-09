package com.ca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TouristsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouristsApplication.class, args);
	}

}
