package com.panting.user.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 用户登录业务逻辑类 判断用户登录
 * 
 */
public class SuperLoginOutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		HttpSession session = request.getSession(false);// 防止创建Session
		if (session == null) {
			response.sendRedirect("pages/superUser/login.jsp");
			return;
		}
		session.removeAttribute("user");
		response.sendRedirect("pages/superUser/login.jsp");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
