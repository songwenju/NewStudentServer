package com.panting.user.dao;

import com.panting.user.domain.SuperUser;


/**
 * 用户添加等
 * interface
 */
public interface SuperUserDao {
	/**
	 * 添加用户
	 * @param user
	 */
	public int add(SuperUser user);
	
	
	/**
	 * 由用户的身份（姓名或邮箱）获取用户信息
	 * @param LoginIdentity
	 * @return
	 */
	public SuperUser getDbUser(String name);
	/**
	 * 重新输入密码
	 * @param userEmail
	 * @param userPassword
	 * @return
	 */
	public int resetPassword(String userEmail,String userPassword);
	
}
