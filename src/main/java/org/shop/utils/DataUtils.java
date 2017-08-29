package org.shop.utils;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.shop.entity.Complaint;

/**
 * @author chongxue
 * @see 工具类：主要用于数据的处理
 */
public class DataUtils {
	
	/*
	 * 提取数据，提取今年每个月的投诉率放在列表中
	 */
	 public List<Double> getIndex(List<Complaint> complaints){
		//获取本年度 投诉处理及时率
		 List<Double> indexList = new ArrayList<Double>();
		  
		 for (int i = 0; i < 12; i++) {
			 Complaint complaint = complaints.get(i);
			 Double index = complaint.getXindex(); 
			 index = index * 100;
			 indexList.add(index); 
		} 
		return indexList;
		
	 }
	 
	 /*
		 * 根据数据总结出9月的投诉率情况
		 */
	 public List<Double> getLastIndex(List<Complaint> complaints){
		//获取去年 投诉处理及时率
		List<Double> laIndexList = new ArrayList<Double>();
		
		for (int i = 0; i < 12; i++) {
			Complaint complaint = complaints.get(i);
			Double lastindex = complaint.getLastIndex(); 
			DecimalFormat format = new DecimalFormat("0.0");
			lastindex = lastindex * 100;
			lastindex = Double.valueOf(format.format(lastindex));
			laIndexList.add(lastindex); 
		} 
			
		return laIndexList;
			
	 }
	 
	 /*
		 * 提取数据，提取今年每个月的投诉率放在列表中
		 */
	 public String findResult(List<Complaint> complaints){ 
		 
		 Double index = complaints.get(8).getXindex();
		 Double lindex = complaints.get(7).getXindex();
		 Double Laindex = complaints.get(8).getLastIndex();
		 
		 Double sum1 = index -lindex;
		 String keyword = "提升";
		 if(index<lindex) {
			 keyword = "下降";
			 sum1 = lindex - index;
		 } 
		 
		 Double sum2 = index - Laindex;
		 String keyword2= "提升";
		 if(index<Laindex){
			 keyword2 = "下降";
			 sum2 = Laindex - lindex;
		 }
		 
		 DecimalFormat format = new DecimalFormat("0.0%"); 
		 
		 String  results = "结论：9月份投诉处理及时率为"+format.format(index)
				 +"，与上月（"+format.format(lindex)+"）比"+keyword
				 +format.format(sum1)+"，与去年同期（"+format.format(Laindex)
				 +"）比"+keyword2+format.format(sum2);
		 
		 
		 
		 return results;
	 }
	

}
