<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新生入学管理后台 </title>

<link rel="stylesheet" href="./css/index.css" type="text/css" media="screen" />

<script type="text/javascript" src="./js/jquery.min.js"></script>
<script type="text/javascript" src="./js/tendina.min.js"></script>
<script type="text/javascript" src="./js/common.js"></script>
<!-- frame跳转到最外层 -->
<script type="text/javascript">
if (top.location != location){
 top.location.href = location.href;
 }
</script>
</head>
<body>
    <!--顶部-->
    <div class="layout_top_header">
            <div style="float: left"><span style="font-size: 16px;line-height: 45px;padding-left: 20px;color: #8d8d8d">新生入学管理后台</span></div>
            <div id="ad_setting" class="ad_setting">
                <a class="ad_setting_a" href="javascript:; ">
                    <i class="icon-user glyph-icon" style="font-size: 20px"></i>
                    <span>${user.userName}</span>
                    <i class="icon-chevron-down glyph-icon"></i>
                </a>
                <ul class="dropdown-menu-uu" style="display: none" id="ad_setting_ul">
                    <li class="ad_setting_ul_li"> <a href="/NewStudentServer/superLoginOutServlet"><i class="icon-signout glyph-icon"></i> <span class="font-bold">退出</span> </a> </li>
                </ul>
            </div>
    </div>
    <!--顶部结束-->
    <!--菜单-->
    <div class="layout_left_menu">
        <ul id="menu">
            <li class="childUlLi">
               <a href="main.html"  target="menuFrame"><i class="glyph-icon icon-home"></i>主页</a>
                <ul>
                    <li><a href="./confirm.jsp" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>确认报到</a></li>
                </ul>
            </li>
            <li class="childUlLi">
                <a href="user.html"  target="menuFrame"> <i class="glyph-icon icon-reorder"></i>信息录入</a>
                <ul>
                    <li><a href="./teacherAdd.jsp" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>班主任信息录入</a></li>
                    <li><a href="./stuAdd.jsp" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>学生信息录入</a></li>
                </ul>
            </li>
            
            <li class="childUlLi">
                <a href="user.html"  target="menuFrame"> <i class="glyph-icon icon-reorder"></i>信息管理</a>
                <ul>
                    <li><a href="./allStuInfo.jsp" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>全部学生信息</a></li>
                    <li><a href="./confirmStuInfo.jsp" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>报到学生信息</a></li>
                    <li><a href="./unConfirmStuInfo.jsp" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>未报到学生信息</a></li>
                    <li><a href="./teacherInfo.jsp" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>班主任信息</a></li>
                </ul>
            </li>
            <li class="childUlLi">
                <a href="role.html" target="menuFrame"> <i class="glyph-icon icon-reorder"></i>角色管理</a>
                <ul>
                    <li><a href="./resetPwd.jsp" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>修改密码</a></li>
                     <li><a href="./adminAdd.jsp" target="menuFrame"><i class="glyph-icon icon-chevron-right"></i>添加管理员</a></li>
                </ul>
            </li>
           
        </ul>
    </div>
    <!--菜单-->
    <div id="layout_right_content" class="layout_right_content">

        <div class="mian_content">
            <div id="page_content">
                <iframe id="menuFrame" name="menuFrame" src="./confirm.jsp" style="overflow:visible;"
                        scrolling="yes" frameborder="no" width="100%" height="100%"></iframe>
            </div>
        </div>
    </div>
    <div class="layout_footer">
        <p>Copyright © 2017 - 河南工业大学</p>
    </div>
</body>
</html>