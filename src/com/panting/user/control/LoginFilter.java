package com.panting.user.control;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.panting.user.domain.SuperUser;

public class LoginFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// 获得在下面代码中要用的request,response,session对象
		HttpServletRequest servletRequest = (HttpServletRequest) request;
		HttpServletResponse servletResponse = (HttpServletResponse) response;
		HttpSession session = servletRequest.getSession();
		// 获得用户请求的URI
		String path = servletRequest.getRequestURI();
		// System.out.println(path);
		// 从session里取员工工号信息
		SuperUser superUser = (SuperUser) session.getAttribute("user");
		/*
		 * 创建类Constants.java，里面写的是无需过滤的页面 for (int i = 0; i <
		 * Constants.NoFilter_Pages.length; i++) { if
		 * (path.indexOf(Constants.NoFilter_Pages[i]) > -1) {
		 * chain.doFilter(servletRequest, servletResponse); return; } }
		 */
		// 登陆页面无需过滤
		if (path.indexOf("/login.jsp") > -1) {
			chain.doFilter(servletRequest, servletResponse);
			return;
		}
		// 判断如果没有取到员工信息,就跳转到登陆页面
		if (superUser == null || "".equals(superUser.getUserName())) {
			// 跳转到登陆页面
			servletResponse.sendRedirect("login.jsp");
		} else {
			// 已经登陆,继续此次请求
			chain.doFilter(request, response);
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}
//
//	public static final String login_page = "pages/superUser/login.jsp";
//
//	public void doFilter(ServletRequest servletRequest,
//			ServletResponse servletResponse, FilterChain filterChain)
//			throws ServletException, IOException {
//		HttpServletRequest request = (HttpServletRequest) servletRequest;
//		HttpServletResponse response = (HttpServletResponse) servletResponse;
//		String currentURL = request.getRequestURI();
//		String ctxPath = request.getContextPath();
//		// 除掉项目名称时访问页面当前路径
//		String targetURL = currentURL.substring(ctxPath.length());
//		HttpSession session = request.getSession(false);
//		// 对当前页面进行判断，如果当前页面不为登录页面
//		if (!("/admin/Public/login.jsp".equals(targetURL))) {
//			System.out.println("1" + targetURL + "ctxPath:" + ctxPath
//					+ "currentURL:" + currentURL);
//			// 在不为登陆页面时，再进行判断，如果不是登陆页面也没有session则跳转到登录页面，
//			if (session == null || session.getAttribute("admin") == null) {
//				response.sendRedirect(logout_page);
//				return;
//			} else {
//				// 这里表示正确，会去寻找下一个链，如果不存在，则进行正常的页面跳转
//				filterChain.doFilter(request, response);
//				return;
//			}
//		} else {
//			// 这里表示如果当前页面是登陆页面，跳转到登陆页面
//			filterChain.doFilter(request, response);
//			return;
//		}

//	}

}
