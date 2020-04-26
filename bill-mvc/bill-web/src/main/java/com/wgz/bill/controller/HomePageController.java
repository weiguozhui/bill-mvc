package com.wgz.bill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
	
	@RequestMapping("/bill-web")
	public String homePage() {
		System.out.println("home page");
		return "index";
		
	}

}
