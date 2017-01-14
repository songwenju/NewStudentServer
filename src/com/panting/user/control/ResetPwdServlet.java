package com.panting.user.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.panting.user.dao.UserDao;
import com.panting.user.dao.impls.UserImpls;
import com.panting.user.domain.User;

public class ResetPwdServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String email= request.getParameter("email");
		String userPassword = request.getParameter("userPassword");
		UserDao userDao = new UserImpls();
		User user = userDao.getDbUser(email);
		if (user == null) {
			System.out.println("用户不存在");
			response.getOutputStream().write("1".getBytes("UTF-8"));
		}else {
			int result = userDao.resetPassword(email, userPassword);
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
