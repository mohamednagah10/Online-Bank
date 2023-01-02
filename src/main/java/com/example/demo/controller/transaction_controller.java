package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model_account.account_request;
import com.example.demo.model_transaction.transaction_request;
import com.example.demo.model_transaction.transaction_response;
import com.example.demo.model_user.user_request;
import com.example.demo.services.transaction_service;

@RestController
@RequestMapping("transaction")
public class transaction_controller {

	@Autowired
	private transaction_service service;
	
	@CrossOrigin
	@PostMapping("transfer")
	public  transaction_response transfer(@RequestBody transaction_request req) {
		return service.showTransfer(req);
	}

	@CrossOrigin
	@PostMapping("inquire")
	public List <transaction_response> inquire(@RequestBody transaction_request req) {
			return service.inquire(req);
		
	}
	
}
