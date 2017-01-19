package com.panting.user.dao;

import java.util.List;

import com.panting.user.domain.Teacher;


/**
 * 班主任添加
 * interface
 */
public interface TeacherDao {
	
	/**
	 * 添加用户
	 * @param teacher 
	 * @return
	 */
	public int add(Teacher teacher);
	
	/**
	 * 获得Teacher
	 * @param teachNum
	 * @return
	 */
	public Teacher getDbTeacher(int teachNum);

	/**
	 * 修改密码
	 * @param teachNum 
	 * @param pwd 密码
	 * @return
	 */
	public int resetPassword(int teachNum,String pwd);
	
	/**
	 * 更新班主任信息
	 * @param teachNum 
	 * @param teacher 
	 */
	public int updateTeacher(int teachNum,Teacher teacher); 
	
	/**
	 * 删除班主任信息
	 * @param teachNum 
	 */
	public int deleteTeacher(int teachNum); 
	
	/**
	 * 获得所有的班主任信息
	 * @return
	 */
	public List<Teacher> getAllTeacher();
	
}
