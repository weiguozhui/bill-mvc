package com.wgz.bill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wgz.bill.dao.TestDao;
import com.wgz.bill.service.ITestDaoService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import java.util.HashMap;
//import java.util.Map;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private TestDao testDao;
	
	@Autowired
	private ITestDaoService testDaoService;
	
	// 返回jason 格式才需要此注解 这里直接返回试图解析
	//method = { RequestMethod.POST }, produces = { "application/json;charset=UTF-8" }
	//@ResponseBody
	@RequestMapping(value = "/login")
	public String login(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("login");

		System.out.println("testDao userName " + testDao.getUserName());
		testDaoService.sayhello();

//		Map<String, Object> reuslt = new HashMap<String, Object>();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String authCode = request.getParameter("authCode");
//		HttpSession session = request.getSession();
//		Object sb = (String) session.getAttribute("authCode");
//        String bsstr =sb.toString();
//        System.out.println("sessionCode:==="+bsstr);
		System.out.println("userName:" + userName);
		System.out.println("password:" + password);
		System.out.println("VerificationCode:" + authCode);
		return "html/bill-info";
//        if(null !=bsstr&&bsstr.equalsIgnoreCase(authCode)){
//            session.setAttribute("authCode","");
//            return "html/bill-info";
//        }else{
//            session.setAttribute("authCode","");
//            return "index";
//        }
	}

}
