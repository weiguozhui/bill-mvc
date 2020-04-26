package com.wgz.bill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController {
	
	@ResponseBody
	@RequestMapping(value="/hello",produces = "application/json;charset=UTF-8")
	public String Test() {
		System.out.println("hello world");
		return "hello";
		
	}

}
