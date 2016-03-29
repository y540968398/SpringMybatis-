package com.tiewl.mybatis.model;
/**
* @author Hank.xiao
* @E-mail Hank.xiao@zhan.com
* @version Createtime：2016年3月25日 上午11:46:40
* @description 
*/
public class SysUser
{
	private int id;
	private String username;
	private String password;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username = username;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
}
