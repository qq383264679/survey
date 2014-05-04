package com.feng.action;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.hibernate.classic.Validatable;

import com.feng.model.User;
import com.feng.service.UserService;

public class LognAction extends BaseAction<User>{
	private UserService userService;    //UserService 已经在Spring容器中注入
	//根据自动装配模式进行装配
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	//到达登陆界面
	public String toLognView() {
		System.out.println("调用了toLognView方法");
		return "lognView";
	}
	//进行登录效应
	public void doLogn() {
		System.out.println("调用了登录效应方法！");
		System.out.println(this.user.getName() + ":::::" +this.user.getPassword());
		//return "success";
	}
	//struts2 效应方法
	public void validate() {
		//this.addFieldError("test", "sssssssss");
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("application/json;charset=UTF-8");
		response.setHeader("Charset","UTF-8"); 
		
	
		boolean b = userService.checkUser(this.user);
		if(!b) {
			JSONObject json = new JSONObject();
			json.put("succeed", false);
			json.put("message", "账号或者密码有误!");
			try {
				response.getWriter().write(json.toString());
				System.out.println(json.toString());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		System.out.println(b);
	}
}
