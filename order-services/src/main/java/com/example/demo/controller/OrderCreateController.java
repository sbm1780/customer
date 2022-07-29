package com.example.demo.controller;

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
	
	@PostMapping("/createOrder")
	public OrderCreateResponse createOrder(@RequestBody CretateOrderRequest cretateOrderRequest) {
		return orderCreateService.createOrder(cretateOrderRequest);
		
	}
	
	@GetMapping("getById/{id}")
	public OrderCreateResponse getById(@PathVariable long id) {
		return orderCreateService.getById(id);
		
	}

}
