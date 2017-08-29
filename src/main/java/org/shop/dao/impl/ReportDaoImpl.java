package org.shop.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.shop.dao.ReportDao;
import org.shop.entity.Complaint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 
/**
 * @author chongxue
 * @see ReportDao实现类
 */
@Repository("reportDao")
public class ReportDaoImpl implements ReportDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	
	public Complaint load(Integer id) {
		// TODO Auto-generated method stub
		 
		return (Complaint)this.getCurrentSession().load(Complaint.class, id);
	}

	public Complaint get(Integer id) {
		// TODO Auto-generated method stub
		return (Complaint)this.getCurrentSession().get(Complaint.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Complaint> findAll() { 
		
		List<Complaint> complaint = this.getCurrentSession().createQuery("from Complaint").list();
 
		return complaint;
	}


	public void persist(Complaint entity) {
		// TODO Auto-generated method stub
		
	}


	public Integer save(Complaint entity) {
		// TODO Auto-generated method stub
		return null;
	}


	public void saveOrUpdate(Complaint entity) {
		// TODO Auto-generated method stub
		
	}


	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}


	public void flush() {
		// TODO Auto-generated method stub
		
	}

}
