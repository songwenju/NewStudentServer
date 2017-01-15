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

<title>添加学生信息</title>
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

所有班主任的信息

</body>
</html>
