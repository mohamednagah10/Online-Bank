package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model_transaction.transaction_entity;

@Repository
public interface transaction_repository extends JpaRepository <transaction_entity,Integer> {
	transaction_entity findByAccountNumFrom(Integer accountNumFrom);
	
	List<transaction_entity> findByaccountNumFrom (Integer arr);
	
	}
