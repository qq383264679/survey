package com.feng.dao.imp;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.feng.dao.BaseDao;
/**
 * BaseDaoImp是一个抽象的类 专门用来继承
 * @author Administrator
 *
 * @param <T>
 */

public abstract class BaseDaoImp<T> implements BaseDao<T> {
	//注入sessionFactory
	@Resource
	private SessionFactory sf;
	@Override
	public void saveEntity(T t) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().save(t);
	}

	@Override
	public void saveOrUpdateEntity(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEntity(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEntity(T t) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().delete(t);;
		
	}

	@Override
	public void batchEntityByHQL(String hql, Object... object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T loadEntity(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getEntity(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findEntityByHQL(String hql, Object... objects) {
		// TODO Auto-generated method stub
		Query q = sf.getCurrentSession().createQuery(hql);
		for(int i = 0; i < objects.length; i++) {
			q.setParameter(i, objects[i]);
		}
		return q.list();
	}

}
