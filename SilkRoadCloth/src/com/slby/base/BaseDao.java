package com.slby.base;

import java.util.List;


import com.slby.util.PageInfo;


/**
 * 集合持久层的公用的增、删、改、查接口
 * <T>表示传入的实体类
 * @author sp
 * @param <T>
 * 2016.7.21
 */
public interface BaseDao<T> {
	/**
	 * 根据id查询
	 * @param t
	 * @return
	 */
	public T getById(String userId);
	
	/**
	 * 返回分页后的数据
	 * @param pageView
	 * @param id
	 * @type  int
	 * @return
	 */
	public List<T> query(PageInfo page,T t);
	
	/**
	 * 返回所有数据
	 * @param t
	 * @return
	 */
	public List<T> queryAll(T t);
	
	/**
	 * 添加
	 * @param t
	 */
	public void add(T t);
	
	/**
	 * 删除
	 * @param id
	 */
	public void delete(String id);
	
	/**
	 * 修改
	 * @param t
	 */
	public void modify(T t);

	
}
