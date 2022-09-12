package com.example.country;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.example.country.controller"})
@EnableEurekaClient
public class CountryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountryApplication.class, args);
	}

}
