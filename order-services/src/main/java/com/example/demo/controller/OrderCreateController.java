package com.example.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.CretateOrderRequest;
import com.example.demo.response.OrderCreateResponse;
import com.example.demo.service.OrderCreateService;

@RestController
@RequestMapping("/orderService")
public class OrderCreateController {
	
	@Autowired
	private OrderCreateService orderCreateService;
	private static final Logger LOGGER = LogManager.getLogger(OrderCreateController.class);
	@PostMapping("/createOrder")
	public OrderCreateResponse createOrder(@RequestBody CretateOrderRequest cretateOrderRequest) {
		LOGGER.info("Info level log message");
	    LOGGER.debug("Debug level log message");
	    LOGGER.error("Error level log message");
		return orderCreateService.createOrder(cretateOrderRequest);
		
	}
	
	@GetMapping("getById/{id}")
	public OrderCreateResponse getById(@PathVariable long id) {
		return orderCreateService.getById(id);
		
	}

}
