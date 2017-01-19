package com.panting.common;

/**
 * 项目用到的常数
 * 
 */
public class ProjectConstant {

	// 发送邮件相关
	// 发送邮箱的地址
	public static final String EMAIL_FROM = "songwenju_it@163.com";
	// 发送邮箱的名称，@之前
	public static final String EMAIL_USER = "songwenju_it";
	// 发送邮箱的密码
	public static final String EMAIL_PWD = "swj123456";
	public static final String EMAIL_REGISTER_TEXT = "<p>亲爱的用户，您好！感谢您注册随手涂鸦，希望我们的产品能带给您快乐，让您的生活更加的多姿多彩。</p><p>随手涂鸦</p>";
	public static final String EMAIL_REGISTER_TITLE = "随手涂鸦:注册";
	public static final String EMAIL_FINDPWD_TEXT = "亲爱的用户：您好！您此次重置密码的验证码如下，如非本人操作，请忽略此文件</ br>";
	public static final String EMAIL_FINDPWD_TITLE = "随手涂鸦:找回密码校验码";
	public static final String EMAIL_PORT = "smtp.163.com";// 或smtp.qq.com

	// 数据库相关

	// 远程数据库的相关
	public static final String REMOTE_DB_URL = "jdbc:mysql://27.54.227.50:3306/bike";
	public static final String REMOTE_DB_USER_NAME = "bike";
	public static final String REMOTE_DB_PASSWORD = "swj123";
	public static final String REMOTE_SUPER_USER_TABLE = "newstu_superuser";

	// 本地数据库的相关
	public static final String LOCAL_DB_URL = "jdbc:mysql://localhost:3306/newstudent";
	public static final String LOCAL_DB_USER_NAME = "root";
	public static final String LOCAL_DB_PASSWORD = "admin";

	public static final String LOCAL_SUPER_USER_TABLE = "newstu_superuser";

	// 加载驱动
	public static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	
	// 本地数据库连接
	public static final String DB_URL = LOCAL_DB_URL;
	public static final String DB_USER_NAME = LOCAL_DB_USER_NAME;
	public static final String DB_PASSWORD = LOCAL_DB_PASSWORD;
	public static final String STUDENT_TABLE = "newstu_student";
	public static final String TEACHER_TABLE = "newstu_headmaster";
	public static final String SUPER_USER_TABLE = LOCAL_SUPER_USER_TABLE;

	// 远程数据库连接
//	public static final String DB_URL = REMOTE_DB_URL;
//	public static final String DB_USER_NAME = REMOTE_DB_USER_NAME;
//	public static final String DB_PASSWORD = REMOTE_DB_PASSWORD;
//	public static final String USER_TABLE = REMOTE_USER_TABLE;
//	public static final String SUPER_USER_TABLE = REMOTE_SUPER_USER_TABLE;

}
