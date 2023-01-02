package com.example.demo.model_payment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class payment_entity {

	@Id
	@Column(name = "id_payment")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iDNum;
	
	@Column(name = "account_num")
		private Integer accountNum;
	
	@Column(name = "order_num")
		private String orderNum;
	
	@Column(name = "Amount")
		private Float amount;

	public Integer getiDNum() {
		return iDNum;
	}

	public void setiDNum(Integer iDNum) {
		this.iDNum = iDNum;
	}

	public Integer getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(Integer accountNum) {
		this.accountNum = accountNum;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}
	
	
}
