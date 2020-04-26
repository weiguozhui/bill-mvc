package com.wgz.bill.dao;

import org.springframework.stereotype.Component;

@Component("testDao")
public class TestDao {
	
	private String userName="hello";

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
