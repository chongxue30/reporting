package org.shop.service.impl;

import java.util.List;

import org.shop.dao.ReportDao;
import org.shop.entity.Complaint;
import org.shop.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 

@Service("reportService")
public class ReportServiceImpl implements ReportService {
	
	@Autowired
	private ReportDao reportDao;

	public Complaint load(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Complaint get(Integer id) {
		// TODO Auto-generated method stub
		return reportDao.get(id);
	}

	public List<Complaint> findAll() {
		// TODO Auto-generated method stub 
		return reportDao.findAll();
	}

}
