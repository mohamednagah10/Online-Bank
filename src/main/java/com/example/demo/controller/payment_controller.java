package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model_payment.payment_request;
import com.example.demo.model_payment.payment_response;
import com.example.demo.services.payment_service;

@RestController
@RequestMapping("payment")
public class payment_controller {
	
	@Autowired
	private payment_service service ;

	@CrossOrigin
	@PostMapping("pay")
	public payment_response pay(@RequestBody payment_request req ) {		
		return service.pay(req);
	}
	@CrossOrigin
	@PostMapping("inquire")
	public List <payment_response> inquire(@RequestBody payment_request req) {
		return service.showPayment(req);
		
	}
}