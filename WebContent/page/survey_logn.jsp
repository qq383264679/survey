<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
    <link rel="stylesheet" type="text/css" href="../themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../themes/icon.css">
    <script type="text/javascript" src="../js/jquery-2.0.3.min.js"></script>
    <script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
</head>
<script>
	$(document).ready(function() {
		$("#submit_").click(function() {
			$('#form1').form('submit', {    
			    url:'lognAction_doLogn.action',    
			    onSubmit: function(){    
        	        var isValid = $("#form1").form('validate');
        	        if(isValid) {
        	        	return true;
        	        } else {
        	        	return false;
        	        }
			    },    
			    success:function(data){    
			    	var data = eval('(' + data + ')');
			    	if(data.succeed) {
			    		$.messager.alert("提示", data.message, "info", function() {
			    			parent.location.reload();  //iframe 内联 刷新父窗体
			    		});
			    	} else {
			    		$.messager.alert("提示", data.message, "error");
			    	}		    	
			    }    
			});  
		});		
	});
</script>
<body>
	<div class="easyui-panel" title="用户登录">
    	<form id="form1">
        	<table style="margin:0 auto;">
        	 <tr>
             	<td>   
      			  <label for="name">用户名:</label>   
                </td>
                <td>  
      			  <input class="easyui-validatebox" type="text" name="name" data-options="required:true" missingMessage="不能为空" />   
                </td>  
   			 </tr>  
             <tr>
             	<td>
             	  <label for="passsword">密码:</label>
                </td>
                <td>  
                  <input class="easyui-validatebox"	type="password" name="password" required="true" missingMessage="不能为空" />
                </td>
             </tr>
             
             <tr>
             	<td colspan="2">
             	      		
                	<br />
                	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id="submit_" type="button" value="登录" />
                </td>
             </tr>
            </table> 
        </form>
    </div>
</body>
</html>
    