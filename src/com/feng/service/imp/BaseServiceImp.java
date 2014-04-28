package com.feng.service.imp;

import java.util.List;

import javax.annotation.Resource;

import com.feng.dao.BaseDao;
import com.feng.service.BaseService;
/**
 * BaseServiceImp��һ�����󷽷� ��������service��̳�
 * @author Administrator
 *
 * @param <T>
 */
public abstract class BaseServiceImp<T> implements BaseService<T> {
	private BaseDao<T> dao;
	@Resource
	public void setBaseDao(BaseDao<T> dao) {
		this.dao = dao;
	}

	@Override
	public void saveEntity(T t) {
		// TODO Auto-generated method stub
		dao.saveEntity(t);
	}

	@Override
	public void saveOrUpdateEntity(T t) {
		// TODO Auto-generated method stub
		dao.saveOrUpdateEntity(t);;
	}

	@Override
	public void updateEntity(T t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEntity(T t) {
		// TODO Auto-generated method stub
		
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

	@Override
	public List<T> findEntityByHQL(String hql, Object... objects) {
		// TODO Auto-generated method stub
		return dao.findEntityByHQL(hql, objects);
	}

}
