package com.example.demo.registerReq;


import com.example.demo.model_account.account_request;
import com.example.demo.model_user.user_request;

public class register_req {

	user_request request ;
	account_request account_request ;
	
	public user_request getRequest() {
		return request;
	}
	public void setRequest(user_request request) {
		this.request = request;
	}
	public account_request getAccount_request() {
		return account_request;
	}
	
	public void setAccount_request(account_request account_request) {
		this.account_request = account_request;
	}
	
	
}
