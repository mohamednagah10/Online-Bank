package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model_account.account_entity;
import com.example.demo.model_transaction.transaction_entity;
import com.example.demo.model_transaction.transaction_request;
import com.example.demo.model_transaction.transaction_response;
import com.example.demo.repository.account_repository;
import com.example.demo.repository.transaction_repository;

@Service
public class transaction_service {

	@Autowired
	private transaction_repository repo;
	
	@Autowired
	private account_repository repo_acc;

	
	public transaction_response showTransfer (transaction_request req ) {

		transaction_entity entity = new transaction_entity();
		account_entity account_entity = repo_acc.findById(req.getAccountNumFrom()).get();
		account_entity account_entityTo = repo_acc.findById(req.getAccountNumTo()).get();
		transaction_response response = new transaction_response();
		
		if(account_entityTo.getAccountNim().equals(req.getAccountNumTo()))
			if(account_entity.getBalance() >= req.getAmount()) {
				response.setmsj("Yes");
				account_entity.setBalance(account_entity.getBalance()-req.getAmount());
				account_entityTo.setBalance(account_entityTo.getBalance()+req.getAmount());
			 	BeanUtils.copyProperties(req, entity);
				repo_acc.save(account_entity);
				repo_acc.save(account_entityTo);
				repo.save(entity);				
				return response;
			}
			
		response.setmsj("No");
		return response;
		
	}
	public List <transaction_response> inquire(transaction_request req) {
		
		List <transaction_entity> transaction_entity = repo.findByaccountNumFrom(req.getAccountNumFrom());
		
		List <transaction_response> response = new ArrayList<>();
		
		for(transaction_entity i : transaction_entity) {
			 
			transaction_response trans_response= new transaction_response();
			BeanUtils.copyProperties(i,trans_response);
			response.add(trans_response);
			
		}
		return response;
		
	}
}
