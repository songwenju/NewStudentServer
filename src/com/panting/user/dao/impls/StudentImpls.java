package com.panting.user.dao.impls;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.panting.common.ProjectConstant;
import com.panting.db.BaseDB;
import com.panting.user.dao.StudentDao;
import com.panting.user.domain.Student;

/**
 * 用户添加等
 */
public class StudentImpls extends BaseDB implements StudentDao{
	public static final String STUDENT_TABLE = ProjectConstant.STUDENT_TABLE;

	/**
	 * 添加用户
	 * @param student
	 */
	public int add(Student student) {

		String sql = "insert into "+STUDENT_TABLE+"(" +
				"stuNum," +
				"name," +
				"pwd," +
				"sex," +
				"avatar," +
				"classRoom," +
				"academe," +
				"address," +
				"originPlace," +
				"isReport," +
				"qq," +
				"wechat," +
				"email," +
				"phone," +
				"Specialty," +
				"headmasterid)"
				+"values('"
				+student.getStuNum()+"','"
				+student.getName()+"','"
				+student.getPwd()+"','"
				+student.getSex()+"','"
				+student.getAvatar()+"','"
				+student.getClassRoom()+"','"
				+student.getAcademe()+"','"
				+student.getAddress()+"','"
				+student.getOriginPlace()+"','"
				+student.getIsReport()+"','"
				+student.getQq()+"','"
				+student.getWechat()+"','"
				+student.getEmail()+"','"
				+student.getPhone()+"','"
				+student.getSpecialty()+"','"
				+student.getHeadmasterid()+"')";
		System.out.println(sql);
		return super.executeUpdate(sql);
	}

	/**
	 * 获得学生信息
	 * @param stuNum
	 * @return
	 */
	@Override
	public Student getDbStudent(int stuNum){
		Student student = null;
		String sql = "select * from "+STUDENT_TABLE+" where stuNum=  ? "; 
		super.res = super.executeQuery(sql,stuNum);
		
			try {
				if(super.res.next()){
					student =new Student();
					
					student.setStuNum(stuNum);
					student.setName(super.res.getString("name"));
					student.setPwd(super.res.getString("pwd"));
					student.setSex(super.res.getString("sex"));
					student.setAvatar(super.res.getString("avatar"));
					student.setClassRoom(super.res.getString("classRoom"));
					student.setAcademe(super.res.getString("academe"));
					student.setAddress(super.res.getString("address"));
					student.setOriginPlace(super.res.getString("originPlace"));
					student.setIsReport(super.res.getInt("isReport"));
					student.setQq(super.res.getInt("qq"));
					student.setWechat(super.res.getString("wechat"));
					student.setEmail(super.res.getString("email"));
					student.setPhone(super.res.getInt("phone"));
					student.setSpecialty(super.res.getString("specialty"));
					student.setHeadmasterid(super.res.getInt("headmasterid"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		super.closeConn();
		return student;
	}

	/**
	 * 重置密码
	 * @param stuNum
	 * @param pwd
	 * @return
	 */
	@Override
	public int resetPassword(int stuNum, String pwd) {
		String sql = "update "+STUDENT_TABLE+" set pwd='"
				+pwd+"' where stuNum='"+stuNum+"'";
		return super.executeUpdate(sql);
	}

	/**
	 * 更新学生信息
	 */
	@Override
	public int updateStudent(int stuNum, Student student) {
		//UPDATE Person SET Address = 'Zhongshan 23', City = 'Nanjing'
		//WHERE LastName = 'Wilson'
		String sql = "update "+STUDENT_TABLE+"set " +
				"avatar = " +student.getAvatar()+
				",classRoom = " +student.getClassRoom()+
				",academe = " + student.getAcademe()+
				",isReport =" + student.getIsReport()+
				",qq = " + student.getQq()+
				",wechat = " + student.getWechat() +
				",email = " + student.getEmail() +
				",phone = " + student.getPhone() +
				",Specialty =" + student.getSpecialty()+
				",headmasterid = "+ student.getHeadmasterid()+
				"' where stuNum='"+stuNum+"'";
		System.out.println(sql);
		return super.executeUpdate(sql);
		
	}

	@Override
	public int deleteStudent(int stuNum) {
		String sql = "delete from "+STUDENT_TABLE+"' where stuNum='"+stuNum+"'";
		return super.executeUpdate(sql);
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> students = new ArrayList<Student>();
		Student student = null;
		String sql = "select * from "+STUDENT_TABLE; 
		super.res = super.executeQuery(sql);
			try {
				while(super.res.next()){
					student =new Student();
					
					student.setStuNum(super.res.getInt("stuNum"));
					student.setName(super.res.getString("name"));
					student.setPwd(super.res.getString("pwd"));
					student.setSex(super.res.getString("sex"));
					student.setAvatar(super.res.getString("avatar"));
					student.setClassRoom(super.res.getString("classRoom"));
					student.setAcademe(super.res.getString("academe"));
					student.setAddress(super.res.getString("address"));
					student.setOriginPlace(super.res.getString("originPlace"));
					student.setIsReport(super.res.getInt("isReport"));
					student.setQq(super.res.getInt("qq"));
					student.setWechat(super.res.getString("wechat"));
					student.setEmail(super.res.getString("email"));
					student.setPhone(super.res.getInt("phone"));
					student.setSpecialty(super.res.getString("specialty"));
					student.setHeadmasterid(super.res.getInt("headmasterid"));
					students.add(student);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		super.closeConn();
		return students;
	}

	@Override
	public List<Student> getAllReportStudent() {
		List<Student> students = new ArrayList<Student>();
		Student student = null;
		String sql = "select * from "+STUDENT_TABLE +"where isReport = 1";
		super.res = super.executeQuery(sql);
			try {
				while(super.res.next()){
					student =new Student();
					
					student.setStuNum(super.res.getInt("stuNum"));
					student.setName(super.res.getString("name"));
					student.setPwd(super.res.getString("pwd"));
					student.setSex(super.res.getString("sex"));
					student.setAvatar(super.res.getString("avatar"));
					student.setClassRoom(super.res.getString("classRoom"));
					student.setAcademe(super.res.getString("academe"));
					student.setAddress(super.res.getString("address"));
					student.setOriginPlace(super.res.getString("originPlace"));
					student.setIsReport(super.res.getInt("isReport"));
					student.setQq(super.res.getInt("qq"));
					student.setWechat(super.res.getString("wechat"));
					student.setEmail(super.res.getString("email"));
					student.setPhone(super.res.getInt("phone"));
					student.setSpecialty(super.res.getString("specialty"));
					student.setHeadmasterid(super.res.getInt("headmasterid"));
					students.add(student);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		super.closeConn();
		return students;
	}

	@Override
	public List<Student> getAllNoReportStudent() {
		List<Student> students = new ArrayList<Student>();
		Student student = null;
		String sql = "select * from "+STUDENT_TABLE +"where isReport = 0"; 
		super.res = super.executeQuery(sql);
			try {
				while(super.res.next()){
					student =new Student();
					
					student.setStuNum(super.res.getInt("stuNum"));
					student.setName(super.res.getString("name"));
					student.setPwd(super.res.getString("pwd"));
					student.setSex(super.res.getString("sex"));
					student.setAvatar(super.res.getString("avatar"));
					student.setClassRoom(super.res.getString("classRoom"));
					student.setAcademe(super.res.getString("academe"));
					student.setAddress(super.res.getString("address"));
					student.setOriginPlace(super.res.getString("originPlace"));
					student.setIsReport(super.res.getInt("isReport"));
					student.setQq(super.res.getInt("qq"));
					student.setWechat(super.res.getString("wechat"));
					student.setEmail(super.res.getString("email"));
					student.setPhone(super.res.getInt("phone"));
					student.setSpecialty(super.res.getString("specialty"));
					student.setHeadmasterid(super.res.getInt("headmasterid"));
					students.add(student);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		super.closeConn();
		return students;
	}

}
