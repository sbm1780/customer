package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Order;
import com.example.demo.repository.OrderCreateRepository;
import com.example.demo.request.CretateOrderRequest;
import com.example.demo.response.OrderCreateResponse;

@Service
public class OrderCreateService {
	
	@Autowired
	OrderCreateRepository orderCreateRepository;
	//Sample comment
	public OrderCreateResponse createOrder(CretateOrderRequest cretateOrderRequest) {
		
		Order order = new Order();
		order.setEmail(cretateOrderRequest.getEmail());
		order.setCreatedByUser(cretateOrderRequest.getCreatedByUser());
		order.setDealerId(5);
		orderCreateRepository.save(order);
		return new OrderCreateResponse(order);
	}

	public OrderCreateResponse getById(long id) {
		return new OrderCreateResponse(orderCreateRepository.findById(id).get());
	}
}
