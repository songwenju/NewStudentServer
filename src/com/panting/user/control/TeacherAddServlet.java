package com.panting.user.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.panting.user.dao.TeacherDao;
import com.panting.user.dao.impls.TeacherImpls;
import com.panting.user.domain.Teacher;
import com.panting.util.MD5Utils;

/**
 * 添加老师的 servlet
 * 
 */
public class TeacherAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request. setCharacterEncoding("UTF-8");
		int teachNum= Integer.parseInt(request.getParameter("teachNum"));
		String name = request.getParameter("name");
		String academe = request.getParameter("academe");
		
		Teacher teacher = new Teacher();
		teacher.setTeachNum(teachNum);
		teacher.setAcademe(academe);
		teacher.setName(name);
		teacher.setPwd(MD5Utils.decode("123456"));
		System.out.println(teacher);
		TeacherDao impls = new TeacherImpls();
		int result = impls.add(teacher);
		System.out.println("add result:"+result);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
