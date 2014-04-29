package com.feng.service.imp;

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
//ÏñSpringÈÝÆ÷ÖÐ×¢ÈëUserServiceImp Àà
@Service("userService")
public class UserServiceImp extends BaseServiceImp<User> implements UserService{
	
	@Resource(name="userDao")
	public void setBaseDao(BaseDao<User> dao) {
		// TODO Auto-generated method stub
		super.setBaseDao(dao);
	}

}
