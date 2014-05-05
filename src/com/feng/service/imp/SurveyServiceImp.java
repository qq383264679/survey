package com.feng.service.imp;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.springframework.stereotype.Service;

import com.feng.dao.BaseDao;
import com.feng.model.Survey;
import com.feng.model.User;
import com.feng.service.SurveyService;
@Service("surveyService")
public class SurveyServiceImp implements SurveyService {
	@Resource(name="surveyDao")
	private BaseDao<Survey> baseDao;
	@Override
	public List<Survey> findAllSurveys(User user) {
		// TODO Auto-generated method stub
		String hql = "from Survey s where s.user.id = ?";
		return baseDao.findEntityByHQL(hql, user.getId());
	}
	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		 String hql = "from User where name = ?";
    	 Query q = baseDao.getSession().getCurrentSession().createQuery(hql);
    	 q.setParameter(0, user.getName());
    	 
    	 User u = (User) q.uniqueResult();
    	 return u;
	}
}
