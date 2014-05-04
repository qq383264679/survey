package com.feng.action;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.hibernate.classic.Validatable;

import com.feng.model.User;
import com.feng.service.UserService;

public class LognAction extends BaseAction<User>{
	private UserService userService;    //UserService �Ѿ���Spring������ע��
	//�����Զ�װ��ģʽ����װ��
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
	//�����½����
	public String toLognView() {
		System.out.println("������toLognView����");
		return "lognView";
	}
	//���е�¼ЧӦ
	public void doLogn() {
		System.out.println("�����˵�¼ЧӦ������");
		System.out.println(this.user.getName() + ":::::" +this.user.getPassword());
		//return "success";
	}
	//struts2 ЧӦ����
	public void validate() {
		//this.addFieldError("test", "sssssssss");
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("application/json;charset=UTF-8");
		response.setHeader("Charset","UTF-8"); 
		
	
		boolean b = userService.checkUser(this.user);
		if(!b) {
			JSONObject json = new JSONObject();
			json.put("succeed", false);
			json.put("message", "�˺Ż�����������!");
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
