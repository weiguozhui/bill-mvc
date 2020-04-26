package com.wgz.bill.service.impl;

import org.springframework.stereotype.Service;

import com.wgz.bill.service.ITestDaoService;

@Service
public class TestDaoServiceImpl implements ITestDaoService {

	public void sayhello() {
		System.out.println("say hello to you");

	}

}
