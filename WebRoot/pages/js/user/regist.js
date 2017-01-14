/*文件加载完，要调用它*/
$(function() {
	//循环遍历每一个错误信息,循环遍历他，调用一个方法来显示错误信息
	$(".labelError").each(function(){
		showError($(this)); //遍历每一个元素，调用showError方法
	});
	
	/**
	 * 使用ajax校验用户名
	 */
	$("#loginName").blur(function(){
		validateLoginName();
	});
	
	/**
	 * 校验密码
	 */
	$("#password").blur(function (){
		validateLoginPass();
	});
	
	/**
	 * 校验确认密码
	 */
	$("#rePassword").blur(function (){
		validateReLoginPass();
	});
	
	/**
	 * 邮箱自动补全
	 */
	completeEmail();
	
	/**
	 * 使用ajax校验用户注册邮箱
	 */
	$("#email").blur(function(){
		validateEmail();
	});
	
	/**
	 * 提交按钮时进行验证
	 */
	
	 $("#button").click(function(){
		 var $btn = $(this).button('loading');
		 validateSubmit();
		 $btn.button('reset');
	 });
});

function validateSubmit(){
	var nameflag = validateLoginName();
	var passflag = validateLoginPass();
	var rePassflag = validateReLoginPass();
	var emailflag = validateEmail();
	if(nameflag == 1 && passflag == 1 && rePassflag == 1 && emailflag == 1){
		$("#registForm").submit();
	}else{
		return false;
	}
}

function validateLoginName(){
	var value = $("#loginName").val();
	var flag = 1;
	if(value == null || value == ""){
		$("#loginNameError").css("display","");//把隐藏的css显示出来。
		$("#loginNameError").text("用户名不能为空！");
		return false;
	}
	if(value.length < 3 ||value.length > 20){
		$("#loginNameError").css("display","");
		$("#loginNameError").text("用户名长度在3～20之间！");
		return false;
	}
	/*alert(value);*/
	$.ajax({
		url:"/bookstore/regist_loginNameByAjax",
		data:{val:value},
		async:false,	//必须是false，要不然还未等服务器校验完就执行完了。
		cache:false,
		type:"POST",	
		dataType:"json",
		success:function(result){
			if(result != null){
				$("#loginNameError").css("display","");//把隐藏的css显示出来。
				$("#loginNameError").text(result);
				flag = 0;
				false;
			}else{
				$("#loginNameError").css("display","none");
			}
		}
	});
	return flag;
}


function validateLoginPass(){
	var password = $("#password").val();
	var flag = 1;
	if(password == "" || password == null){
		$("#passwordError").css("display","");
		$("#passwordError").text("密码不能为空");
		return false;
	}
	
	if(password.length > 20||password.length < 6){
		$("#passwordError").css("display","");
		$("#passwordError").text("密码长度在6～20之间！");
		return false;
	}else{
		$("#passwordError").css("display","none");
	}
	return flag;
}

function validateReLoginPass(){
	var password = $("#password").val();
	var flag = 1;
	var repassword = $("#rePassword").val();
	
	if(password == "" || password == null){
		$("#rePasswordError").css("display","");
		$("#rePasswordError").text("重置密码不能为空");
		return false;
	}
	if(password != repassword){
		$("#rePasswordError").css("display","");
		$("#rePasswordError").text("再次输入的密码与原密码不同！");
		return false;
	}else{
		$("#rePasswordError").css("display","none");
	}
	return flag;
}

function completeEmail(){
	var mailList = new Array("@qq.com","@gmail.com","@126.com","@163.com","@hotmail.com","@yahoo.com","@yahoo.com.cn","@live.com","@sohu.com","@sina.com");
	$("#email").bind("keyup",function(){
		var val = $(this).val();
		if(val == '' || val.indexOf("@")>-1){
			$(".emaillist").hide();
			return false;
		}
		$('.emaillist').empty();
		for(var i = 0;i<mailList.length;i++){
			var emailText = $(this).val();
			$('.emaillist').append('<li class=addr>'+emailText+mailList[i]+'</li>');
		}
		$('.emaillist').show();
		$('.emaillist li').click(function(){
			$('#email').val($(this).text());
			$('.emaillist').hide();
		});	
	});			
	
}

function validateEmail(){
	var value = $("#email").val().replace(/[ ]/g,"");
	var flag = 1;
	if(value == null || value == ""){
		$("#emailError").css("display","");//把隐藏的css显示出来。
		$("#emailError").text("邮箱不能为空！");
		return false;
	}
	var mailFilter  = /^\w+((-\w+)|(\.\w+))*\@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/;
	if (!mailFilter.test(value)){
		$("#emailError").css("display","");
		$("#emailError").text("邮箱格式不对！");
		return false;
	}else{
		$("#emailError").css("display","none");
	}
	/*alert(value);*/
	$.ajax({
		url:"/bookstore/regist_emailByAjax",
		data:{val:value},
		async:false,	
		cache:false,
		type:"POST",	
		dataType:"json",
		success:function(result){
			if(result != null){
				$("#emailError").css("display","");//把隐藏的css显示出来。
				$("#emailError").text(result);
				flag=0;
				false;
			}else{
				$("#emailError").css("display","none");
			}
		}
	});
	return flag;
}
/**
 * 判断当前元素是否存在内容，如果存在显示，不存在不显示
 */
function showError(ele){
	var text = ele.text();
	if(text != false) {
		ele.css("display","");
	} else {
		ele.css("display","none");//如果没有内容，隐藏元素
	}
}