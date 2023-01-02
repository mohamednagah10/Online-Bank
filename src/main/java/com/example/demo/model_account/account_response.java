package com.example.demo.model_account;

public class account_response {
	
		private Integer accountNim;
		private Integer num;
		private Character accountType;
		private Float balance;

		
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
