package com.example.greetings.feignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.greetings.controller.CountryData;


@FeignClient(url = "${country.service.url}", value = "country-feign-client")
//@FeignClient(value = "api-gateway")

public interface CountryFeignClient {

	//@GetMapping("/country-services/country")
	@GetMapping("/country")
	public CountryData getMessage();
		
}
