package com.example.demo.model_payment;

public class payment_response {

	private Integer accountNum;		
	private String orderNum;
	private Float amount;
	private String msj;
	public String getMsj() {
		return msj;
	}

	public void setMsj(String msj) {
		this.msj = msj;
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
