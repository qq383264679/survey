// JavaScript Document
$(document).ready(function(e) {
	//分类导航点击事件
	//1
	$("#acc_index").click(function(e) {
		//select which 选择一个选项卡面板，'which'参数可以是选项卡面板的标题或者索引。 
		$('#tt').tabs('select','首页'); 
		//去除其他的样式
		remove_addStyle("#acc_index");
	});
	//5
	$("#acc_reg").click(function(e) {
		//自定义tab选项
		var t = $('#tt').tabs('exists', '用户注册');//判断是tab是否打开(exist)存在
		if(!t) {
			//添加tab选项
			$('#tt').tabs('add',{    
				title:'用户注册',    
				content:"<iframe src='page/survey_reg.html' width='100%' height='100%' scrolling='no' frameborder=0></iframe>",    
				closable:true, 
				selected:true   
			}); 
		} else {
			$('#tt').tabs('select','用户注册');
		} 
		//去除其他的样式
		remove_addStyle("#acc_reg");
		
	});
	//tab选项
	 $('#tt').tabs({
		    //选择tab选项时候触发的函数        
			onSelect:function(title){    
				//tab 1
				if(title == '首页') {
					//去除其他的样式
					remove_addStyle("#acc_index");
				} 
    			if(title == '用户注册') {
					//去除其他的样式
					remove_addStyle("#acc_reg");
				}
			},
			//关闭tab 时候触发函数
		    onBeforeClose:function(title,index) {
				alert("是否关闭");
			}		    
	   });
});
//去除样式为自身加上样式
function remove_addStyle(idName) {
	//去除其他的样式
	$("#acc_").find("li").each(function(){
		//alert($(this).text())
		$(this).removeClass("selected");
	});
	//为自身增加style
	$(idName).attr("class", "selected"); 
}