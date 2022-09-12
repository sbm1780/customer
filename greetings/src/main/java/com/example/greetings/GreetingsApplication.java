package com.example.greetings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.example.greetings.controller"})
@EnableEurekaClient
@EnableFeignClients("com.example.greetings.feignclients")

public class GreetingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingsApplication.class, args);
	}

}
