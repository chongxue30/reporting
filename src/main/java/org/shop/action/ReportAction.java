package org.shop.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Namespace;
import org.shop.entity.Complaint; 
import org.shop.service.ReportService;
import org.shop.utils.DataUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

/**
 * 
 * @author chongxue
 * @see 控制层Struts2采用annotation  * 约束注解方式实现action的零配置，
 * 需要在WEB-INF下创建content目录（必须是content），里面存放是视图层jsp
 */
@Namespace("/show")
public class ReportAction extends ActionSupport implements ModelDriven<Complaint>, Preparable {

	@Autowired
	private ReportService reportService;
		
	private List<Complaint> complaints;
	
	//indexList 存放今年的投诉率
	private List<Double> indexList;
	
	//laIndexlist 存放去年的投诉率
	private List<Double> laIndexList;
	
	//result 结论
	private String results;
	  
	/* 
	 * @see 默认action从数据库中查询所有的投诉数据
	 */
	@Override
	public String execute() throws Exception {
		
		complaints = reportService.findAll();
		
		DataUtils utils = new DataUtils();
		indexList = utils.getIndex(complaints);
		laIndexList = utils.getLastIndex(complaints);
		results = utils.findResult(complaints); 
		return SUCCESS;
	}
	
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		
	}

	public Complaint getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Complaint> getComplaints() {
		return complaints;
	}

	public void setComplaints(List<Complaint> complaints) {
		this.complaints = complaints;
	}

	  

	public List<Double> getIndexList() {
		return indexList;
	}

	public void setIndexList(List<Double> indexList) {
		this.indexList = indexList;
	}

	public List<Double> getLaIndexList() {
		return laIndexList;
	}

	public void setLaIndexList(List<Double> laIndexList) {
		this.laIndexList = laIndexList;
	}

	public String getResults() {
		return results;
	}

	public void setResults(String results) {
		this.results = results;
	}

}
