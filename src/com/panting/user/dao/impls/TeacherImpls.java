package com.panting.user.dao.impls;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.panting.common.ProjectConstant;
import com.panting.db.BaseDB;
import com.panting.user.dao.TeacherDao;
import com.panting.user.domain.Teacher;

public class TeacherImpls extends BaseDB implements TeacherDao {
	public static final String TEACHER_TABLE = ProjectConstant.TEACHER_TABLE;

	@Override
	public int add(Teacher teacher) {
		String sql = "insert into "+TEACHER_TABLE+"(" +
				"teachNum," +
				"name," +
				"pwd," +
				"academe)"
				+"values('"
				+teacher.getTeachNum()+"','"
				+teacher.getName()+"','"
				+teacher.getPwd()+"','"
				+teacher.getAcademe()+"')";
		System.out.println(sql);
		return super.executeUpdate(sql);
	}

	@Override
	public Teacher getDbTeacher(int teachNum) {
		Teacher teacher = null;
		String sql = "select * from "+TEACHER_TABLE+" where teachNum=  ? "; 
		super.res = super.executeQuery(sql,teachNum);
		
			try {
				if(super.res.next()){
					teacher =new Teacher();
					teacher.setId(super.res.getInt("id"));
					teacher.setTeachNum(teachNum);
					teacher.setName(super.res.getString("name"));
					teacher.setPwd(super.res.getString("pwd"));
					teacher.setAcademe(super.res.getString("academe"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		super.closeConn();
		
		return teacher;
	}

	@Override
	public int resetPassword(int teachNum, String pwd) {
		String sql = "update "+TEACHER_TABLE+" set pwd='"
				+pwd+"' where stuNum='"+teachNum+"'";
		return super.executeUpdate(sql);
	}

	@Override
	public int updateTeacher(int teachNum, Teacher teacher) {
		String sql = "update "+TEACHER_TABLE+"set " +
				"academe = " +teacher.getAcademe()+
				"' where stuNum='"+teachNum+"'";
		System.out.println(sql);
		return super.executeUpdate(sql);
	}

	@Override
	public int deleteTeacher(int teachNum) {
		String sql = "delete from "+TEACHER_TABLE+"' where teachNum='"+teachNum+"'";
		return super.executeUpdate(sql);
	}

	@Override
	public List<Teacher> getAllTeacher() {
		List<Teacher> teachers = new ArrayList<Teacher>();
		Teacher teacher = null;
		String sql = "select * from "+TEACHER_TABLE; 
		super.res = super.executeQuery(sql);
			try {
				while(super.res.next()){
					teacher =new Teacher();
					teacher.setId(super.res.getInt("id"));
					teacher.setTeachNum(super.res.getInt("teachNum"));
					teacher.setName(super.res.getString("name"));
					teacher.setPwd(super.res.getString("pwd"));
					teacher.setAcademe(super.res.getString("academe"));
					teachers.add(teacher);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		super.closeConn();
		return teachers;
	}

}
