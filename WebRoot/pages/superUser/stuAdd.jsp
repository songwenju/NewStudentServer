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
<link rel="stylesheet"
	href="<c:url value ='/bootstrap3/css/bootstrap.min.css'/>">
<script src="<c:url value ='/bootstrap3/js/jquery-1.11.2.min.js'/>"></script>
<script src="<c:url value ='/bootstrap3/js/bootstrap.js'/>"></script>
<script src="<c:url value ='/pages/js/user/login.js'/>"></script>

</head>

<body>

	<div class="container">
		<div class="col-md-6 col-center-block">
			<form class="form-horizontal" id="studentAdd" method="post"
				action="stuAddServlet">

				<div class="form-group">
					<label for="stuNum" class="col-sm-3 control-label">学号:</label>
					<div class="col-sm-8">
						<input type="text" name="stuNum" class="form-control" id="stuNum"
							placeholder="学号"> <label class="error" id="stuNumError"></label>
					</div>
				</div>
				<div class="form-group">
					<label for="stuName" class="col-sm-3 control-label">姓名:</label>
					<div class="col-sm-8">
						<input type="text" name="stuName" class="form-control"id="stuName" placeholder="姓名"> 
							<label class="error"id="stuNameError"></label>
					</div>
				</div>

				<div class="form-group">
					<label class="col-sm-3 control-label" style="margin-left:10px">性别:</label>
					<div class="col-sm-7" style="margin-left:10px">
						<label class="radio"> 
							<input type="radio" name="sex"
								id="optionsRadios1" value="男" checked> 男</label> 
						<label class="radio"> 
							<input type="radio" name="sex"
								id="optionsRadios2" value="女"> 女</label>
					</div>
				</div>
				<div class="form-group">
					<label for="originPlace" class="col-sm-3 control-label">生源地:</label>
					<div class="col-sm-8">
						<input type="text" name="originPlace" class="form-control"id="stuName" placeholder="生源地"> 
							<label class="error"id="originPlaceError"></label>
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
					<label for="classRoom" class="col-sm-3 control-label">班级:</label>
					<div class="col-sm-8">
						<input type="text" name="classRoom" class="form-control"id="classRoom" placeholder="班级"> 
							<label class="error"id="classError"></label>
					</div>
				</div>
				<div class="form-group">  
	                <label class="col-sm-3 control-label">班主任:</label>  
	                <div class="col-sm-8 controls">    
	                <select name = "headmasterid"> 
	                <%@page import="com.panting.user.dao.TeacherDao"%>
	                <%@page import="com.panting.user.dao.impls.TeacherImpls"%>
	                <%@page import="com.panting.user.domain.Teacher"%>
	                <%
						TeacherDao teacherDao = new TeacherImpls();
						List<Teacher> allTeacher = teacherDao.getAllTeacher();
						if(allTeacher.size() == 0){%>
						
						<script type="text/javascript">
        					alert("请先添加教师信息！");
						</script>
						
						<% }else{%>
	                    <%
	                    	for(int i = 0;i < allTeacher.size();i++){
	                    	Teacher teacher = allTeacher.get(i);
	                    %>  
			              <option   value=<%=teacher.getId()%>>  
			                    <%=teacher.getName()%>  
			              </option>  
  							<%} }%>   
	                      <!--   <option value="1">梁燕</option>  
	                        <option value="2">杨计国</option>  
	                        <option value="3">鲍庆丹</option>  
	                        <option value="4">杨帆</option>  
	                        <option value="5">白冰</option>  --> 
	                    </select>  
	                </div>  
	            </div>  
				<div class="form-group">
					<label for="class" class="col-sm-3 control-label">家庭住址:</label>
					<div class="col-sm-8">
						<input type="text" name="address" class="form-control"id="address" placeholder="家庭住址"> 
							<label class="error"id="addressError"></label>
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
