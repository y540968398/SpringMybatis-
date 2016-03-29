package com.tiewl.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tiewl.mybatis.model.SysUser;


public class LoginFilter implements Filter {

	public void init(FilterConfig filterConfig) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		SysUser user = (SysUser) req.getSession().getAttribute("user");
		String loginPath = req.getContextPath()+"/system/login.do";///console/users/login.do
		//System.out.println("------->loignPath:"+loginPath);
		if(user==null){
			String url = req.getRequestURI();
			if(!url.contains("/user/checkLogin")){
				resp.sendRedirect(loginPath);
			}else{
				
				chain.doFilter(req, resp);
			}
			
		}else{
			chain.doFilter(req, resp);
		}
		

	}

	public void destroy() {

	}

}
