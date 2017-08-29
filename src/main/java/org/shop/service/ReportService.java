package org.shop.service;

import java.util.List;

import org.shop.entity.Complaint;
 
/**
 * 
 * @author chongxue
 * @see service 接口
 */
public interface ReportService {
	public Complaint load(Integer id);

	public Complaint get(Integer id);
 
	public List<Complaint> findAll(); //查询数据库中的所有数据

}
