package com.panting.user.domain;

/**
 * 超级用户信息
 */
public class Teacher {
	private int id;						
	private int teachNum;		    //教师编号
	private String name;			//教师姓名
	private String pwd;				//密码
	private String academe;			//学院
	
	
	public Teacher() {
		super();
	}
	public Teacher(int id, int teachNum, String name, String pwd, String academe) {
		super();
		this.id = id;
		this.teachNum = teachNum;
		this.name = name;
		this.pwd = pwd;
		this.academe = academe;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTeachNum() {
		return teachNum;
	}
	public void setTeachNum(int teachNum) {
		this.teachNum = teachNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getAcademe() {
		return academe;
	}
	public void setAcademe(String academe) {
		this.academe = academe;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", teachNum=" + teachNum + ", name="
				+ name + ", pwd=" + pwd + ", academe=" + academe + "]";
	}
	
	
}

