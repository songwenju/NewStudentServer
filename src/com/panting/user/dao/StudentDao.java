package com.panting.user.dao;

import java.util.List;

import com.panting.user.domain.Student;


/**
 * 用户添加等
 * interface
 */
/**
 * @author songwenju
 *
 */
public interface StudentDao {
	
	/**
	 * 添加用户
	 * @param student 学生信息
	 * @return
	 */
	public int add(Student student);
	
	/**
	 * 获得Student
	 * @param LoginIdentity
	 * @return
	 */
	public Student getDbStudent(int stuNum);

	/**
	 * 修改密码
	 * @param stuNum 学号
	 * @param pwd 密码
	 * @return
	 */
	public int resetPassword(int stuNum,String pwd);
	
	/**
	 * 更新学生信息
	 * @param stuNum 学号
	 * @param student 学生对象
	 */
	public int updateStudent(int stuNum,Student student); 
	
	/**
	 * 删除学生信息
	 * @param stuNum 学号
	 */
	public int deleteStudent(int stuNum); 
	
	/**
	 * 获得所有的学生信息
	 * @return
	 */
	public List<Student> getAllStudent();
	
	/**
	 * 获得所有的报道的学生信息
	 * @return
	 */
	public List<Student> getAllReportStudent();
	
	
	/**
	 * 获得所有未报到的学生信息
	 * @return
	 */
	public List<Student> getAllNoReportStudent();
}
