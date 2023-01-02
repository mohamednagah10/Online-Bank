package com.example.demo.repository;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model_account.account_entity;


@Repository	
public interface account_repository extends JpaRepository <account_entity,Integer> {
	
	List<account_entity> findByNum(Integer num);
	
	
}
