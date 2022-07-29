package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dealers")
public class Dealer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long dealrId;
	
	@Column(name = "dlr_Name")
	private String dlrName;
	
	@Column(name = "city")
	private String city;
	@Column(name = "street")
	private String street;
	
	public Long getDealrId() {
		return dealrId;
	}
	public void setDealrId(Long dealrId) {
		this.dealrId = dealrId;
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
	public String getDlrName() {
		return dlrName;
	}
	public void setDlrName(String dlrName) {
		this.dlrName = dlrName;
	}
	
	
}
