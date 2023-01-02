package com.example.demo.model_transaction;

public class transaction_response {

	private Integer accountNumFrom;
	private Character typeTransaction;
	private Integer accountNumTo;
	private Float amount;
	private String message;
	
	public Integer getAccountNumFrom() {
		return accountNumFrom;
	}
	public void setAccountNumFrom(Integer accountNumFrom) {
		this.accountNumFrom = accountNumFrom;
	}
	public Character getTypeTransaction() {
		return typeTransaction;
	}
	public void setTypeTransaction(Character typeTransaction) {
		this.typeTransaction = typeTransaction;
	}
	public Integer getAccountNumTo() {
		return accountNumTo;
	}
	public void setAccountNumTo(Integer accountNumTo) {
		this.accountNumTo = accountNumTo;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setmsj(String message) {
		this.message=message;
	}
	
}
