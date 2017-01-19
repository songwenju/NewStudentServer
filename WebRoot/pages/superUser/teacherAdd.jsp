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

<title>添加班主任信息</title>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="login">
<link rel="stylesheet" href="<c:url value ='/css/common.css'/>">
<link rel="stylesheet"
	href="<c:url value ='/bootstrap3/css/bootstrap.min.css'/>">

<link rel="stylesheet" href="<c:url value ='/pages/css/teacherAdd.css'/>">
<script src="<c:url value ='/bootstrap3/js/jquery-1.11.2.min.js'/>"></script>
<script src="<c:url value ='/bootstrap3/js/bootstrap.js'/>"></script>
<script src="<c:url value ='/pages/js/user/login.js'/>"></script>

</head>

<div class="container">
		<div class="col-md-6 col-center-block">
			<form class="form-horizontal" id="studentAdd" method="post"
				action="teacherAddServlet">

				<div class="form-group">
					<label for="teachNum" class="col-sm-3 control-label">教师编号:</label>
					<div class="col-sm-8">
						<input type="text" name="teachNum" class="form-control" id="teachNum"
							placeholder="教师编号"> <label class="error" id="teachNumError"></label>
					</div>
				</div>
				<div class="form-group">
					<label for="name" class="col-sm-3 control-label">姓名:</label>
					<div class="col-sm-8">
						<input type="text" name="name" class="form-control"id="name" placeholder="姓名"> 
							<label class="error"id="nameError"></label>
					</div>
				</div>

				 <div class="form-group">  
	                <label class="col-sm-3 control-label">学院:</label>  
	                <div class="col-sm-8 controls">  
	                    <select name="academe">  
	                        <option value="信息科学与工程学院">信息科学与工程学院</option>  
	                        <option value="粮油食品学院">粮油食品学院</option>  
	                        <option value="外语学院">外语学院</option>  
	                        <option value="新闻与传播学院">新闻与传播学院</option>  
	                        <option value="材料学院">材料学院</option>  
	                    </select>  
	                </div>  
	            </div>  
	           
				<div class="form-group">
					<div class="col-sm-offset-3 col-sm-9">
						<button type="submit" class="btn btn-primary btn-lg"
							data-loading-text="正在添加..." id="button" autocomplete="off">添加</button>
					</div>
				</div>

			</form>
		</div>
	</div>

</body>
</html>
