package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.CretateInquiryRequest;
import com.example.demo.response.DealerInquiryResponse;
import com.example.demo.service.DealerInquiryService;

@RestController
@RequestMapping("/inquiry")
public class OrderInquiryController {

	@Autowired
	private DealerInquiryService dealerInquiryService;
	
	
	  //@Value("${address.test}") private String test;
	 
	
	@PostMapping("/createDealer")
	public DealerInquiryResponse createDealer(@RequestBody CretateInquiryRequest cretateInquiryRequest) {
		return dealerInquiryService.insertDealer(cretateInquiryRequest);
		
	}
	
	@GetMapping("getById/{id}")
	public DealerInquiryResponse getById(@PathVariable long id) {
		return dealerInquiryService.getById(id);
		
	}
	
	
	/*
	 * @GetMapping("/test") public String test() { return test;
	 * 
	 * }
	 */
	 
	}


