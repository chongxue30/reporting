package org.shop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author chongxue
 * @see 实体类对于数据库中的complaint表
 */
@Entity
@Table(name = "Complaint", catalog = "test")
public class Complaint {
	
	private Integer id;
	private String xdata; //日期
	private Double xindex; //今年投诉率
	private Double lastIndex; //去年投诉率
	
	
	public Complaint() {
		super();
	}
	 
	public Complaint(Integer id, String xdata, Double xindex, Double lastIndex) {
		super();
		this.id = id;
		this.xdata = xdata;
		this.xindex = xindex;
		this.lastIndex = lastIndex;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "xdata", nullable = false)
	public String getXdata() {
		return xdata;
	}
	public void setXdata(String xdata) {
		this.xdata = xdata;
	}

	@Column(name = "xindex")
	public Double getXindex() {
		return xindex;
	}

	
	public void setXindex(Double xindex) {
		this.xindex = xindex;
	}

	@Column(name = "lastIndex")
	public Double getLastIndex() {
		return lastIndex;
	}

	public void setLastIndex(Double lastIndex) {
		this.lastIndex = lastIndex;
	}
	 
	
	

}
