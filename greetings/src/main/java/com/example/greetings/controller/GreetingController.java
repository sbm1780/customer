package com.example.greetings.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.greetings.feignClients.CountryFeignClient;

@RestController
//@RequestMapping("/greet")
public class GreetingController {
	
	private static final Logger LOGGER = LogManager.getLogger(GreetingController.class);
	@Autowired
	CountryFeignClient countryFeignClient;
	//@GetMapping("getById/{id}")
	@GetMapping("/greet")
	public Msg getMessage() {
		LOGGER.info("Info level log message inside GreetingController");
	    LOGGER.debug("Debug level log message inside GreetingController");
	    Msg msg = new Msg();
	    msg.setMessage("Good Morning");
	    msg.setCountry(countryFeignClient.getMessage());
		return msg;
		
	}

}
class Msg{
	
	private String message;
	private CountryData country;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public CountryData getCountry() {
		return country;
	}
	public void setCountry(CountryData country) {
		this.country = country;
	}
	
}


