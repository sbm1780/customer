package com.example.demo.response;

import com.example.demo.entity.Order;

public class OrderCreateResponse {

	private Long orderID;
	private String createdByUser;
	private String email;
	
	public OrderCreateResponse(Order order) {		
		this.orderID = order.getOrderId();
		this.createdByUser = order.getCreatedByUser();
		this.email = order.getEmail();
	}
	
	public Long getOrderID() {
		return orderID;
	}
	public void setOrderID(Long orderID) {
		this.orderID = orderID;
	}
	public String getCreatedByUser() {
		return createdByUser;
	}
	public void setCreatedByUser(String createdByUser) {
		this.createdByUser = createdByUser;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
