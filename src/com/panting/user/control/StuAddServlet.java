package com.panting.user.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.panting.user.dao.StudentDao;
import com.panting.user.dao.impls.StudentImpls;
import com.panting.user.domain.Student;
import com.panting.util.MD5Utils;

/**
 * 添加学生的 servlet
 * 
 */
public class StuAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request. setCharacterEncoding("UTF-8");
		int stuNum= Integer.parseInt(request.getParameter("stuNum"));
		// request.getSession().setAttribute("userName", loginUser);
		String name = request.getParameter("stuName");
		String originPlace = request.getParameter("originPlace");
		String sex = request.getParameter("sex");
		String academe = request.getParameter("academe");
		String classRoom = request.getParameter("classRoom");
		String address = request.getParameter("address");
		int headmasterid = Integer.parseInt(request.getParameter("headmasterid"));
		
		Student student = new Student();
		student.setStuNum(stuNum);
		student.setAcademe(academe);
		student.setName(name);
		student.setClassRoom(classRoom);
		student.setOriginPlace(originPlace);
		student.setHeadmasterid(headmasterid);
		student.setPwd(MD5Utils.decode("123456"));
		student.setSex(sex);
		student.setAddress(address);
		System.out.println(student);
		StudentDao impls = new StudentImpls();
		int result = impls.add(student);
		System.out.println("add result:"+result);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
