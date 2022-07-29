package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Dealer;
import com.example.demo.repository.DealerRepository;
import com.example.demo.request.CretateInquiryRequest;
import com.example.demo.response.DealerInquiryResponse;

@Service
public class DealerInquiryService {
	
	@Autowired
	DealerRepository dealerRepository;
	
	public DealerInquiryResponse insertDealer(CretateInquiryRequest cretateInquiryRequest) {
		
		Dealer dealer = new Dealer();
		dealer.setDlrName(cretateInquiryRequest.getDlrName());
		dealer.setCity(cretateInquiryRequest.getCity());
		dealer.setStreet(cretateInquiryRequest.getStreet());

		dealerRepository.save(dealer);
		return new DealerInquiryResponse(dealer);
	}
	
	public DealerInquiryResponse getById(long id) {
		return new DealerInquiryResponse(dealerRepository.findById(id).get());
	}
}
