package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model_account.account_entity;
import com.example.demo.model_payment.payment_entity;
import com.example.demo.model_payment.payment_request;
import com.example.demo.model_payment.payment_response;
import com.example.demo.repository.account_repository;
import com.example.demo.repository.payment_repository;


@Service
public class payment_service {
	@Autowired
	private payment_repository repo;
	@Autowired
	private account_repository repo_acc;
	
	public payment_response pay(payment_request req) {
		
		payment_entity entity = new payment_entity();
		account_entity account_entity = repo_acc.findById(req.getAccountNum()).get();
		payment_response payment_response = new payment_response();
		
			if(account_entity.getBalance() >= req.getAmount()) {
				entity.setOrderNum(req.getOrderNum());
				account_entity.setBalance(account_entity.getBalance()-req.getAmount());
			
				BeanUtils.copyProperties(req, entity);
				repo.save(entity);
				repo_acc.save(account_entity);	
				payment_response.setMsj("yes");
				return payment_response;
			}
		
		payment_response.setMsj("No");
		return payment_response; 

	}
	public List <payment_response> showPayment(payment_request req) {
		
		List <payment_entity> payment_entity = repo.findByaccountNum(req.getAccountNum());
		
		List <payment_response> response = new ArrayList<>();
		
		for(payment_entity i : payment_entity) {
			 
			payment_response payment_response= new payment_response();
			BeanUtils.copyProperties(i,payment_response);
			response.add(payment_response);
			
		}
		return response;
		
	}

}
