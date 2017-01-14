package com.panting.user.dao.impls;

import java.sql.SQLException;

import com.panting.common.ProjectConstant;
import com.panting.db.BaseDB;
import com.panting.user.dao.SuperUserDao;
import com.panting.user.domain.SuperUser;

/**
 * 用户添加等
 */
public class SuperUserImpls extends BaseDB implements SuperUserDao {
	public static final String SUPER_USER_TABLE = ProjectConstant.SUPER_USER_TABLE;

	/**
	 * 添加用户
	 * 
	 * @param user
	 */
	public int add(SuperUser user) {
		String sql = "insert into " + SUPER_USER_TABLE
				+ "(userName,userPassword)" + "values('" + user.getUserName()
				+ "','" + user.getPassword() + "')";
		System.out.println(sql);
		return super.executeUpdate(sql);
	}

	/**
	 * 获得超级管理员
	 * 
	 * @param LoginIdentity
	 * @return
	 */
	public SuperUser getDbUser(String LoginIdentity) {
		SuperUser user = null;
		String sql = "select * from " + SUPER_USER_TABLE + " where name =?";
		System.out.println("getDbUser:" + sql);
		super.res = super.executeQuery(sql, LoginIdentity);
		try {
			if (super.res.next()) {
				user = new SuperUser();
				user.setUserName(LoginIdentity);
				user.setPassword(super.res.getString("pwd"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		super.closeConn();
		return user;
	}

	/**
	 * 重置密码
	 * 
	 * @param userEmail
	 * @param userPassword
	 * @return
	 */
	public int resetPassword(String name, String pwd) {
		int flag = 0;
		String sql = "update " + SUPER_USER_TABLE + " set pwd='"
				+ pwd + "' where name='" + name + "'";
		try {
			super.executeUpdate(sql);
			flag = 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

}
