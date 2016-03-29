package com.tiewl.service.impl;

import org.springframework.stereotype.Service;

import com.tiewl.service.ITestService;

/**
* @author Hank.xiao
* @E-mail Hank.xiao@zhan.com
* @version Createtime：2016年3月25日 上午11:07:28
* @description 
*/
@Service("testService")
public class TestService implements ITestService
{

	public String test()
	{
		
		System.out.println("===========service");
		return "ceshi service";
	}

}
