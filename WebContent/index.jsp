<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>用户调查界面</title>
    <link rel="stylesheet" type="text/css" href="themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="themes/icon.css">
    <script type="text/javascript" src="js/jquery-2.0.3.min.js"></script>
    <script type="text/javascript" src="js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="js/tabUtil.js"></script>
</head>

<style type="text/css">
	.title_image {
		float:left;
	}
	.title_ {
		text-align:center;
		margin-top:40px;
		float:left;
		position:absolute;
		left:50%;
	}
    a:link {text-decoration: none;color:#999}
	a:visited {text-decoration: none;color:#999}
	a:active {text-decoration: none;color:#999}
	a:hover {text-decoration: none;color:#999}
	.selected {
		background-color:#666;
	}
</style>
<script type="text/javascript">
	$(document).ready(function(e) {

    });
</script>
<body>
	<!--整体布局-->
    <div class="easyui-layout" id="cc" style="height:730px;">
    	<div data-options="region:'north',split:false" style="height:110px;"><img class="title_image" src="images/title_survey.jpg"/><h1 class="title_">用户调查系统</h1>
    		        <span class="title_name">
    		        	<c:if test="${!empty user}">
							欢迎用户：${user.name }	
						</c:if>			
        			</span>
    	</div>
        
        <!--左边导航-->
    	<div region="west" style="width:180px" title="导航" split="true">
        	<div class="easyui-accordion" fit="true">
                <div title="基本操作" style="overflow:auto; padding:10px; text-align:center">
              		<ul style="list-style-type:none;" id="acc_">
                    	<li style="margin-top:10px;" class="selected" id="acc_index">
                        	<div>
                            	<a href="#"><font size="+1">首页&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></a>
                        	</div>
                        </li>
                        <li style="margin-top:10px;">
                        	<div class="">
                            	<a href="#"><font size="+1">新建调查页&nbsp;&nbsp;</font></a>
                        	</div>
                        </li>
                        <li style="margin-top:10px;" id="">
                        	<div class="" id="">
                            	<a href="#"><font size="+1">我的调查页&nbsp;&nbsp;</font></a>
                        	</div>
                        </li>
                        <li style="margin-top:10px;" id="">
                        	<div class="" id="">
                            	<a href="#"><font size="+1">参与调查页&nbsp;&nbsp;</font></a>
                        	</div>
                        </li>
                        <li style="margin-top:10px;" id="acc_reg">
                        	<div>
                            	<a href="#"><font size="+1">用户注册页&nbsp;&nbsp;</font></a>
                        	</div>
                        </li>
                        <li style="margin-top:10px;" id="">
                        	<div class="" id="">
                            	<a href="#"><font size="+1">用户权限管理</font></a>
                        	</div>
                        </li>
                        <li style="margin-top:10px;" id="">
                        	<div class="" id="">
                            	<a href="#"><font size="+1">角色管理页&nbsp;&nbsp;</font></a>
                        	</div>
                        </li>
                        <li style="margin-top:10px;" id="">
                        	<div class="" id="">
                            	<a href="#"><font size="+1">权限管理页&nbsp;&nbsp;</font></a>
                        	</div>
                        </li>
                        <li style="margin-top:10px;" id="">
                        	<div class="" id="">
                            	<a href="#"><font size="+1">日志管理页&nbsp;&nbsp;</font></a>
                        	</div>
                        </li>
                    </ul>
                </div>
                <!--测试-->
                <div title="测试"></div>
            </div>
        </div>
        <div data-options="region:'center'">
        	<!-- tab-->
            <div class="easyui-tabs" fit="true" border="false" id="tt">
            	<div title="首页"><iframe src='page/survey_logn.jsp' width='100%' height='100%' scrolling='no' frameborder=0></iframe></div> <!--第一个tab-->
                
                <div title="首页1111111111" closable="true">test</div> <!--第一个tab-->
            </div>
        </div>
    </div>
</body>
</html>
