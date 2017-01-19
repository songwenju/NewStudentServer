package com.panting.user.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.panting.user.dao.StudentDao;
import com.panting.user.dao.impls.StudentImpls;
import com.panting.user.domain.Student;

public class ResetPwdServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		int stuNum= Integer.parseInt(request.getParameter("stuNum"));
		String userPassword = request.getParameter("userPassword");
		StudentDao studentDao = new StudentImpls();
		Student user = studentDao.getDbStudent(stuNum);
		if (user == null) {
			System.out.println("用户不存在");
			response.getOutputStream().write("1".getBytes("UTF-8"));
		}else {
			int result = studentDao.resetPassword(stuNum, userPassword);
			if (result == 1) {
				System.out.println("更新成功");
				response.getOutputStream().write("2".getBytes("UTF-8"));
			}else {
				System.out.println("更新失败");
				response.getOutputStream().write("3".getBytes("UTF-8"));
			}
		}
	}

}
