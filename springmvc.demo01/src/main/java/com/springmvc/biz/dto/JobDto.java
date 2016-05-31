package com.springmvc.biz.dto;

import java.io.Serializable;

public class JobDto implements Serializable{
	
	private static final long serialVersionUID = 5042478063500078382L;
	
	/** 公司	*/
	private String company;
	
	/** 职位 */
	private String position;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
