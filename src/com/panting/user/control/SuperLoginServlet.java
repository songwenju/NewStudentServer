package com.panting.user.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.panting.user.dao.SuperUserDao;
import com.panting.user.dao.impls.SuperUserImpls;
import com.panting.user.domain.SuperUser;

/**
 * 用户登录业务逻辑类 判断用户登录
 * 
 */
public class SuperLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		String loginName = request.getParameter("loginName");
		// request.getSession().setAttribute("userName", loginUser);
		String loginPwd = request.getParameter("loginPass");
		System.out.println("loginUser:" + loginName + " loginPwd:" + loginPwd);

		SuperUserDao impls = new SuperUserImpls();
		SuperUser dbUser = impls.getDbUser(loginName);
		String result;
		if (dbUser == null) {
			result = "用户不存在";
			System.out.println(result);
			request.setAttribute("message", result);
			request.getRequestDispatcher("pages/superUser/login.jsp").forward(
					request, response);
		} else {
			if (dbUser.getPassword().equals(loginPwd)) {
				result = "登录成功";
				System.out.println(result);
				request.setAttribute("message", result);
				request.getSession().setAttribute("user",
						new SuperUser(loginName, loginPwd));
				response.sendRedirect("pages/superUser/home.jsp");
			} else {
				result = "密码错误";
				System.out.println(result);
				request.setAttribute("message", result);
				request.getRequestDispatcher("pages/superUser/login.jsp")
						.forward(request, response);
			}
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
