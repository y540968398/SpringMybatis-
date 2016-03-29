package com.tiewl.dao;

import com.tiewl.mybatis.model.SysUser;

/**
* @author Hank.xiao
* @E-mail Hank.xiao@zhan.com
* @version Createtime：2016年3月25日 上午11:59:54
* @description 
*/
public interface UsersMapper
{
	public SysUser selectByPrimaryKey(int id);
}
