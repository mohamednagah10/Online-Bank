package com.example.demo.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model_account.account_entity;
import com.example.demo.model_user.user_entitity;
import com.example.demo.model_user.user_request;
import com.example.demo.model_user.user_response;
import com.example.demo.registerReq.register_req;
import com.example.demo.repository.account_repository;
import com.example.demo.repository.user_repository;


@Service(value = "service")
public class user_service {

	
	@Autowired
	private user_repository repo;
	@Autowired
	private account_repository account_repository ;
	
	public user_response get_info_user(user_request req) {
		user_entitity entitity= repo.findByEmail(req.getEmail()); 
		user_response response = new user_response();
		BeanUtils.copyProperties(entitity, response);
		return response;	
	}
	
	public user_response register (register_req req) {
		user_entitity entitity ;
		user_response response = new user_response();
		entitity = repo.findByPhoneNum(req.getRequest().getPhoneNum())	;
		
		if(entitity != null) {
		List<account_entity> accountEntities = account_repository.findByNum(entitity.getIDNum());
		
		if(accountEntities != null)
		  if (req.getRequest().getPhoneNum().equals(entitity.getPhoneNum()) )
		   	 if (req.getRequest().getBirthDate().equals(entitity.getBirthDate())) 		   
		  	 {
		  	 	for(account_entity i : accountEntities )
					{
						if(i.getAccountNim().equals(req.getAccount_request().getAccountNim())) {							
							entitity.setPassword(req.getRequest().getPassword());
							repo.save(entitity);		
							user_response userResponse =new user_response();
							userResponse.setMessage("Done");
							BeanUtils.copyProperties(entitity, userResponse);
							return userResponse;
						}						
					}
		   	 }
		
		}
			
		response.setMessage("Not");
			return null;
	}
		
	public user_response login(user_request req) {
		user_response response = new user_response();
		user_entitity entitity = repo.findByEmail(req.getEmail());
		
		if(entitity !=null)
		if ( req.getEmail().equals(entitity.getEmail()))
			if(req.getPassword().equals( entitity.getPassword())) 
		  {

			response.setMessage("Done");
			return response ;
		}
		
		return response ;
	}
}
