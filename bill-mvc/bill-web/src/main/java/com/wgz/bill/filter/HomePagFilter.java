package com.wgz.bill.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomePagFilter implements Filter{

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("start doFilter");
		
		HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        //设置字符集为utf-8
        request.setCharacterEncoding("UTF-8");
        String path=request.getServletPath();
//        System.out.println("the path is "+path);
        if ("/".equals(path)) {
//        	System.out.println("sendredirect to /bill-web "+path);
//        	response.sendRedirect("/bill-web");
//        	chain.doFilter(request, response);
//            return;
		}
        
//        
//        HttpSession session=request.getSession();
//        try {
//            String username=(String) session.getAttribute("username");
//            if(username==null){
//                //判断session是否为空，为空的话就页面重定向到登陆界面
//                response.sendRedirect(request.getContextPath()+"/text/index");
//                return;
//            }
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            //判断session是否为空，为空的话就页面重定向到登陆界面
//            response.sendRedirect(request.getContextPath()+"/text/index");
//            e.printStackTrace();
//            return;
//        }
        chain.doFilter(request, response);
		
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init filter--------");
	}

}
