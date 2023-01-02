package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model_user.user_request;
import com.example.demo.model_user.user_response;
import com.example.demo.registerReq.register_req;
import com.example.demo.services.user_service;

	@RestController
	@RequestMapping("user") // localhost:8282/user
	public class user_controller {

	
	 @Autowired
	 @Qualifier("service")
	private user_service service ;	
	
	@CrossOrigin
	@PostMapping("getinfo")
	public user_response getinfo(@RequestBody user_request req) {
		return service.get_info_user(req);
	}
	
	@CrossOrigin
	@PutMapping("register")
	public user_response register(@RequestBody register_req  req) {
		return service.register(req);
		
	}
	@CrossOrigin
	@PostMapping ("login")
	public user_response login(@RequestBody user_request req) {
		return service.login(req);
		
	}
	
}
