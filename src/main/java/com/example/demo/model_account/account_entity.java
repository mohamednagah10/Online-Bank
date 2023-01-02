package com.example.demo.model_account;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.example.demo.model_user.user_entitity;

@Entity
@Table(name="Account")
public class account_entity {
	
	@Id
	@Column(name = "account_num")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer accountNim;
	
	@Column(name = "ID")
	private Integer num;
	
	@Column(name = "account_type")
		private Character accountType;
	

	@Column(name = "Balance")
		private Float balance;

	
	@ManyToOne
	@JoinColumn(name="ID", nullable = false, referencedColumnName = "ID", insertable =false, updatable = false)
	private user_entitity user;

	public Integer getAccountNim() {
		return accountNim;
	}

	public void setAccountNim(Integer accountNim) {
		this.accountNim = accountNim;
	}

	public Integer getNum() {
		return num;
	}


	public void setNum(Integer num) {
		this.num = num;
	}

	public Character getAccountType() {
		return accountType;
	}


	public void setAccountType(Character accountType) {
		this.accountType = accountType;
	}


	public Float getBalance() {
		return balance;
	}


	public void setBalance(Float balance) {
		this.balance = balance;
	}

	
	
}
