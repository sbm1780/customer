package com.example.country.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
	
	private static final Logger LOGGER = LogManager.getLogger(CountryController.class);
	
	@GetMapping("/country")
	public CountryData getMessage() {
		LOGGER.info("Info level log message inside CountryController ");
	    LOGGER.debug("Debug level log message inside CountryController");
	    CountryData cd = new CountryData();
	    cd.setCountry_name("INDIA");
	    cd.setCountry_greeting("NAMASKAR");
		return cd;
		
	}

}





