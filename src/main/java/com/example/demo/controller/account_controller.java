package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model_account.account_response;
import com.example.demo.model_user.user_request;
import com.example.demo.services.account_service;

@RestController
@RequestMapping("account")
public class account_controller {

	 @Autowired
		private account_service service ;
	
	@CrossOrigin
	@PostMapping("getinfo")
	public List<account_response> getinfo(@RequestBody user_request req  ) {
		return service.getInfoAcc(req);
	}
	
}
