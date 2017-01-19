package com.panting.user.domain;

/**
 * 用户信息
 */
public class Student {
	public Student(){}
	private int id;						
	private int stuNum;		    //学号，保持唯一
	private String name;			//姓名，保证唯一（如果想用它进行登录的话）
	private String pwd;				//密码		
	private String sex;				//性别
	private String avatar;			//头像地址
	private String classRoom;		//班级
	private String academe;			//学院
	private String address;			//家庭地址
	private String originPlace;		//生源地
	private int isReport;			//是否报道，1表示报道成功，0表示未报到
	private int qq;					//qq号
	private String wechat;			//微信号
	private String email;			//邮箱
	private int phone;				//手机号
	private String Specialty;		//爱好
	private int headmasterid;		//班主任id，外键
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStuNum() {
		return stuNum;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}

	public String getAcademe() {
		return academe;
	}

	public void setAcademe(String academe) {
		this.academe = academe;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOriginPlace() {
		return originPlace;
	}

	public void setOriginPlace(String originPlace) {
		this.originPlace = originPlace;
	}

	public int getIsReport() {
		return isReport;
	}

	public void setIsReport(int isReport) {
		this.isReport = isReport;
	}

	public int getQq() {
		return qq;
	}

	public void setQq(int qq) {
		this.qq = qq;
	}

	public String getWechat() {
		return wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getSpecialty() {
		return Specialty;
	}

	public void setSpecialty(String specialty) {
		Specialty = specialty;
	}

	public int getHeadmasterid() {
		return headmasterid;
	}

	public void setHeadmasterid(int headmasterid) {
		this.headmasterid = headmasterid;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", stuNum=" + stuNum + ", name=" + name
				+ ", pwd=" + pwd + ", sex=" + sex + ", avatar=" + avatar
				+ ", classRoom=" + classRoom + ", academe=" + academe
				+ ", address=" + address + ", originPlace=" + originPlace
				+ ", isReport=" + isReport + ", qq=" + qq + ", wechat="
				+ wechat + ", email=" + email + ", phone=" + phone
				+ ", Specialty=" + Specialty + ", headmasterid=" + headmasterid
				+ "]";
	}

}

