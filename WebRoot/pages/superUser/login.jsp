<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>登录系统</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="login">
<link rel="stylesheet" href="<c:url value ='/css/common.css'/>">
<link rel="stylesheet"
	href="<c:url value ='/bootstrap3/css/bootstrap.min.css'/>">

<link rel="stylesheet" href="<c:url value ='/pages/css/login.css'/>">
<script src="<c:url value ='/bootstrap3/js/jquery-1.11.2.min.js'/>"></script>
<script src="<c:url value ='/bootstrap3/js/bootstrap.js'/>"></script>
<script src="<c:url value ='/pages/js/user/login.js'/>"></script>

</head>

<body>
	<div class="container">
		<div class="col-md-6 col-center-block">
			<form class="form-horizontal" id="loginForm" method="post"
				action="superLoginServlet">
				<div class="login_title">
					<br>管理员登录
				</div>
				<div class="form-group">
					<div class="login"></div>
					<div class="col-sm-offset-3 col-sm-9">
						<label class="error" id="msg"> </label>
					</div>
				</div>

				<div class="form-group">
					<label for="loginName" class="col-sm-3 control-label">用户名:</label>
					<div class="col-sm-8">
						<input type="text" name="loginName" class="form-control"
							id="loginName" placeholder="用户名"> <label class="error"
							id="loginNameError"></label>
					</div>
				</div>
				<div class="form-group">
					<label for="loginPass" class="col-sm-3 control-label">密码:</label>
					<div class="col-sm-8">
						<input type="password" class="form-control" id="loginPass"
							name="loginPass" placeholder="密码"> <label
							class="error" id="loginPassError"></label>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-3 col-sm-9">
						<button type="button" class="btn btn-primary btn-lg"
							data-loading-text="登录中..." id="button" autocomplete="off">登录</button>
					</div>
				</div>

			</form>
		</div>
	</div>

</body>
</html>
