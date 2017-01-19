<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

    <!DOCTYPE HTML>  
    <html lang="zh-CN">  
    <head>  
        <meta charset="UTF-8">  
        <title>Bootstrap 3 的多级下拉菜单示例</title>  
        <script type="text/javascript" src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>  
        <link rel="stylesheet" href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css"/>  
        <script type="text/javascript" src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>  
        <style type="text/css">  
            .dropdown-submenu {  
                position: relative;  
            }  
            .dropdown-submenu > .dropdown-menu {  
                top: 0;  
                left: 100%;  
                margin-top: -6px;  
                margin-left: -1px;  
                -webkit-border-radius: 0 6px 6px 6px;  
                -moz-border-radius: 0 6px 6px;  
                border-radius: 0 6px 6px 6px;  
            }  
            .dropdown-submenu:hover > .dropdown-menu {  
                display: block;  
            }  
            .dropdown-submenu > a:after {  
                display: block;  
                content: " ";  
                float: right;  
                width: 0;  
                height: 0;  
                border-color: transparent;  
                border-style: solid;  
                border-width: 5px 0 5px 5px;  
                border-left-color: #ccc;  
                margin-top: 5px;  
                margin-right: -10px;  
            }  
            .dropdown-submenu:hover > a:after {  
                border-left-color: #fff;  
            }  
            .dropdown-submenu.pull-left {  
                float: none;  
            }  
            .dropdown-submenu.pull-left > .dropdown-menu {  
                left: -100%;  
                margin-left: 10px;  
                -webkit-border-radius: 6px 0 6px 6px;  
                -moz-border-radius: 6px 0 6px 6px;  
                border-radius: 6px 0 6px 6px;  
            }  
        </style>  
    </head>  
    <body>  
    <div class="container">  
        <div class="row">  
            <div class="form-group">  
                      
                    <input type="hidden" name="category_id" id="category_id" value="" />  
                    <div class="dropdown">  
                        <a id="dLabel" role="button" data-toggle="dropdown" class="btn btn-white" data-target="#" href="javascript:;"><span id="select-title">选择分类</span> <span class="caret"></span></a>  
                        <ul class="dropdown-menu multi-level" role="menu" aria-labelledby="dropdownMenu">  
                            <li><a href="javascript:;" data-index="1" data-title="一级菜单">一级菜单</a></li>  
                            <li class="dropdown-submenu">  
                                <a href="javascript:;" data-index="2" data-title="一级菜单">一级菜单</a>  
                                <ul class="dropdown-menu">  
                                    <li><a data-index="2-1" href="javascript:;" data-title="二级菜单">二级菜单</a></li>  
                                </ul>  
                            </li>  
                              
                            <li class="dropdown-submenu">  
                                <a tabindex="3" href="javascript:;" data-title="一级菜单">一级菜单</a>  
                                <ul class="dropdown-menu">  
                                    <li><a tabindex="3-1" href="javascript:;" data-title="二级菜单">二级菜单</a></li>  
                                    <li class="divider"></li>  
                                    <li class="dropdown-submenu">  
                                        <a href="javascript:;" data-index="3-2" data-title="二级菜单">二级菜单</a>  
                                        <ul class="dropdown-menu">  
                                            <li><a href="javascript:;" data-index="3-2-1" data-title="三级菜单">三级菜单</a></li>  
                                        </ul>  
                                    </li>  
                                </ul>  
                            </li>  
                        </ul>  
                    </div>  
                      
                </div>  
        </div>  
    </div>  
    </body>  
    </html>  
      
    <script type="text/javascript">  
      
      
    $('.dropdown li a').click(function(){  
          
        console.log(this);    
        title = $(this).attr("data-title");  
        id = $(this).attr("data-index");  
        $("#select-title").text(title);  
        $("#category_id").val(id);  
    })  
      
    </script>  