$(function(){
	$("#loginName").blur(function(){
		validateLoginName();
	});
	
	$("#loginPass").blur(function(){
		validateLoginPass();
	});
	 $("#button").click(function(){
		 var $btn = $(this).button('登录');
		 validateSubmit();
		 $btn.button('reset');
	 });
	
});
 function validateSubmit(){
	
	var nameFlag = validateLoginName();
	var passFlag = validateLoginPass();
	if(nameFlag == 1 && passFlag == 1){
		$("#loginForm").submit();
	}else{
		return false;
	}
 }
 function validateLoginName(){
	var flag = 1;
	var loginName = $("#loginName").val();
	if(loginName == null || loginName == ""){
		$("#loginNameError").css("display","");
		$("#loginNameError").css("color","#cc0001");
		$("#loginNameError").text("登录名不能为空！");
		flag = 0;
		return false;
	}else{
		$("#loginNameError").css("display","none");
	}
	
	if(loginName.length<3 || loginName.length>20){
		$("#loginNameError").css("display","");
		$("#loginNameError").css("color","#cc0001");
		$("#loginNameError").text("登录名长度为3～20位！");
		flag = 0;
		return false;
	}else{
		$("#loginNameError").css("display","none");
	}
		return flag;
 }
 
 function validateLoginPass(){
	 var flag = 1;
	 
	 var loginPass = $("#loginPass").val();
	 if(loginPass == null || loginPass == ""){
		 $("#loginPassError").css("display","");
		 $("#loginPassError").css("color","#cc0001");
		 $("#loginPassError").text("登录密码不能为空！");
		 flag = 0;
		 return false;
	 }else{
		$("#loginPassError").css("display","none");
	}
	 
	 if(loginPass.length<6 || loginPass.length>20){
		 $("#loginPassError").css("display","");
		 $("#loginPassError").css("color","#cc0001");
		 $("#loginPassError").text("登录密码长度为6～20位！");
		 flag = 0;
		 return false;
	 }else{
			$("#loginPassError").css("display","none");
		}
	 return flag;
 }