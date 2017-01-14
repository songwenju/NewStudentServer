<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册成功页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	 <script type="text/javascript" language="javascript">
 		var secs = 3; //倒计时的秒数
		var URL ;
		function Load(url){
			URL = url;
			for(var i=secs;i>=0;i--){
			   window.setTimeout('doUpdate(' + i + ')', (secs-i) * 1000);
			}
		}
		function doUpdate(num){
			document.getElementById('ShowDiv').innerHTML = '恭喜您，注册成功 ,页面将在'+num+'秒后自动跳转到主页' ;
			if(num == 0) { window.location = URL; }
		}
	</script>
  </head>
  
  <body onload="Load('http://localhost:8080/bookstore/pages/main.jsp')">
  	<div class="container" style=" width:880px;min-height:500px;
  	margin-left:230px; background-color: #F5F5F5" align="center" >
    	<br><br><br><br><br>
    	<div id="ShowDiv"></div>
    	如果没有跳转，请点击下面连接。<br>
    	<a href="pages/main.jsp">回到主页</a>
    </div>
  </body>
</html>
