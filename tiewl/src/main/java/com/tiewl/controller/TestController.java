package com.tiewl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tiewl.service.ITestService;

/**
* @author Hank.xiao
* @E-mail Hank.xiao@zhan.com
* @version Createtime：2016年3月25日 上午11:08:37
* @description 
*/
@Controller
@RequestMapping("/system")
public class TestController
{
	
	@Autowired
	private ITestService testService;
	
	@RequestMapping("/index")
	public String index(){
		String string=testService.test();
		System.out.println(string+"&&&&&&&&&&&&&");
		System.out.println("dfsdfsdfdsf");
		return "index";
	}
}
