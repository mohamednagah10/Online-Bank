package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model_user.user_entitity;

@Repository
public interface user_repository extends JpaRepository <user_entitity,Integer> {
	
	user_entitity   findByPhoneNum(String phoneNum);
	user_entitity   findByEmail(String email);

}
