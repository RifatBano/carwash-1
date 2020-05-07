package com.cg.casestudy.carwash.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="WashingDetails")
public class WashingDetails {
	private String washtype;
	private String washpackage;
	private String scheduledate;
	
	public WashingDetails(String washtype, String washpackage, String scheduledate) {
		super();
		this.washtype = washtype;
		this.washpackage = washpackage;
		this.scheduledate = scheduledate;
	}
	public String getWashtype() {
		return washtype;
	}
	public void setWashtype(String washtype) {
		this.washtype = washtype;
	}
	public String getWashpackage() {
		return washpackage;
	}
	public void setWashpackage(String washpackage) {
		this.washpackage = washpackage;
	}
	public String getScheduledate() {
		return scheduledate;
	}
	public void setScheduledate(String scheduledate) {
		this.scheduledate = scheduledate;
	}
	
	

}
