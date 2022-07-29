package com.example.demo.response;

import com.example.demo.entity.Dealer;

public class DealerInquiryResponse {

	private Long dealrId;
	private String dlrName;
	private String city;
	private String street;
	public DealerInquiryResponse(Dealer dealer) {
		
		this.dealrId = dealer.getDealrId();
		this.dlrName = dealer.getDlrName();
		this.city = dealer.getCity();
		this.street = dealer.getStreet();
		
		
	}
	public Long getDealrId() {
		return dealrId;
	}
	public void setDealrId(Long dealrId) {
		this.dealrId = dealrId;
	}
	public String getDlrName() {
		return dlrName;
	}
	public void setDlrName(String dlrName) {
		this.dlrName = dlrName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	

	
	
	
	
	
}
