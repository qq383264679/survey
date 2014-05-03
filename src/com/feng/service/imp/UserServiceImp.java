package com.feng.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.feng.dao.BaseDao;
import com.feng.model.User;
import com.feng.service.UserService;
/**
 * 
 * @author fengchao
 *
 */
//像Spring容器中注入UserServiceImp 类
@Service("userService")
public class UserServiceImp extends BaseServiceImp<User> implements UserService{
	
	@Resource(name="userDao")
	public void setBaseDao(BaseDao<User> dao) {
		// TODO Auto-generated method stub
		super.setBaseDao(dao);
	}

	//判断用户名是否已经注册
	public boolean checkName(String name) {
		boolean b = false;
		String hql = "from User as u";
		List<User> lists = this.findEntityByHQL(hql);
		for(User u : lists) {
			String d_name = u.getName();
			//System.out.println(d_name.trim());
			if(d_name != null && (name.trim().equals(d_name.trim()))) {
				b = true;
				break;
			}
		}
		return b;
	}

	//判断数据库中是否有该用户
	public boolean checkUser(User u) {
		// TODO Auto-generated method stub
		boolean b = false;
		String hql = "from User as u";
		List<User> lists = this.findEntityByHQL(hql);
		for(User user : lists) {
			String name = user.getName().trim();
			String password = user.getPassword().trim();
			//System.out.println(name + ":::" + password);
			if(name.trim().equals(u.getName().trim()) && password.trim().equals(u.getPassword().trim())) {
				b = true;
				break;
			}
		}
		return b;
	}

}
