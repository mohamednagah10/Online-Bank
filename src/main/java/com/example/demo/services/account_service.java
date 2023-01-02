package com.example.demo.services;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model_account.account_entity;
import com.example.demo.model_account.account_response;
import com.example.demo.model_user.user_entitity;
import com.example.demo.model_user.user_request;
import com.example.demo.repository.account_repository;
import com.example.demo.repository.user_repository;


@Service
public class account_service {
	
	@Autowired
	private account_repository repo;

	@Autowired
	private user_repository repository;
	
	public List<account_response> getInfoAcc(user_request req) {
		user_entitity entitity = repository.findByEmail(req.getEmail());
		
		List<account_entity> account_entity = repo.findByNum(entitity.getIDNum());
		List<account_response> response =new ArrayList<>();
		
		for(account_entity i : account_entity) {
			account_response account_response= new account_response();
			BeanUtils.copyProperties(i,account_response);
			response.add(account_response);	
		}
		return response;
		
	}	

}


