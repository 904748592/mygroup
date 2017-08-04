package com.slby.base.impl;

import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.slby.util.PageInfo;


/**
 * 集合持久层的公用的增、删、改、查实现类
 * <T>表示传入的实体类
 * @author sp
 * @param <T>
 * 2016.7.21
 */
public class BaseDaoImpl<T> extends SqlSessionDaoSupport {
	/**
	 * 
	 * 获取传过来的泛型类名字
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String getClassName(){
		//在父类中得到子类声明的父类的泛型信息  
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
		Class<T> clazz = (Class) pt.getActualTypeArguments()[0];
		//clazz.getSimpleName().toString().toLowerCase(); 这里是获取实体类的简单名称，再把类名转为小写
		return clazz.getSimpleName().toString().toLowerCase();
	}
	
	@SuppressWarnings("unchecked")
	public T getById(int id) {
		return (T)getSqlSession().selectOne(this.getClassName()+".getById",id);
	}

	public List<T> query(PageInfo page, T t) {
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put("page", page);
		map.put("t", t);
		return getSqlSession().selectList(this.getClassName()+".query",map);
	}

	public List<T> queryAll(T t) {
		return getSqlSession().selectList(this.getClassName()+".queryAll",t);
	}

	public void add(T t) {
		getSqlSession().insert(this.getClassName()+".add",t);
	}

	public void delete(String id) {
		getSqlSession().delete(this.getClassName()+".deleteById",id);
	}

	public void modify(T t) {
		getSqlSession().update(this.getClassName()+".update",t);
	}

}
