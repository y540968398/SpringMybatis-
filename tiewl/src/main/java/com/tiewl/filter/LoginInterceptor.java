package com.tiewl.filter;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.tiewl.mybatis.model.SysUser;
import com.tiewl.util.PropertyUtils;

public class LoginInterceptor implements HandlerInterceptor
{

	public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception
	{

		// 获取请求地址
		String requestURI = request.getRequestURI();
		// 获取公开地址
		List<String> all_url = PropertyUtils.getKeylist();

		for (String url : all_url)
		{
			if (requestURI.indexOf(url) > 0)
			{

				return true;
			}
		}

		String denyPath = request.getContextPath() + "/error/404.do";
		response.sendRedirect(denyPath);
		return false;

	}

	public void postHandle(HttpServletRequest req, HttpServletResponse resp,
	        Object handler, ModelAndView modelAndView) throws Exception
	{
		SysUser user = (SysUser) req.getSession().getAttribute("user");
		String requestURI = req.getRequestURI();
		if (user == null)
		{

			// gre/api console system

			if (!requestURI.contains("/system/login")
			        && (requestURI.contains("/console/") || requestURI
			                .contains("/system/")))
			{
				String loginPath = req.getContextPath()
				        + "/system/loginPage.do";
				resp.sendRedirect(loginPath);
			}
		}
	}

	public void afterCompletion(HttpServletRequest request,
	        HttpServletResponse response, Object handler, Exception ex)
	        throws Exception
	{

	}

}