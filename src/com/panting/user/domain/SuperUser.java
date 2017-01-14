package com.panting.user.domain;

/**
 * 超级用户信息
 */
public class SuperUser {
	public SuperUser(){}			
	private String userName;			//用户昵称，保证唯一（如果想用它进行登录的话）
	private String password;			//用户密码，用MD5加密		

	public SuperUser(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "SuperUser [userName=" + userName + ", password=" + password
				+ "]";
	}
	
 }

