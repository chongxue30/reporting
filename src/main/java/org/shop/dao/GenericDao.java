package org.shop.dao;

import java.io.Serializable;
import java.util.List;

/**
 * 创建时间：2015-2-11 下午2:26:42
 * 
 * @author andy
 * @version 2.2
 * 
 * Dao通用接口
 */
/**
 * 
 * @author chongxue
 * @see 基础接口，定义了对数据库的曾删改查等基本方法
 */
interface GenericDao<T, PK extends Serializable> {
	
	T load(PK id);
	
	T get(PK id);
	
	List<T> findAll(); //查询所有的数据
	
	void persist(T entity);
	
	PK save(T entity);
	
	void saveOrUpdate(T entity);
	
	void delete(PK id);
	
	void flush();
}
