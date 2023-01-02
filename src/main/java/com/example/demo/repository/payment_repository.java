package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model_payment.payment_entity;

@Repository
public interface payment_repository extends JpaRepository <payment_entity,Integer> {
	payment_entity findByAccountNum(Integer accountNumFrom);
	List<payment_entity> findByaccountNum(Integer accountNum);
}

