package com.example.demo.model_transaction;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class transaction_entity {
	
	@Id
	@Column(name = "id_transaction")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTransaction;
	
	@Column(name = "account_num_from")
		private Integer accountNumFrom;
	
	@Column(name = "type_transaction")
		private Character typeTransaction;
	

	@Column(name = "account_num_to")
		private Integer accountNumTo;

	
	@Column(name = "Amount")
	private Float amount;


	public Integer getIdTransaction() {
		return idTransaction;
	}


	public void setIdTransaction(Integer idTransaction) {
		this.idTransaction = idTransaction;
	}


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
	
}
