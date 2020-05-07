package com.cg.casestudy.carwash.entity;

import org.bson.types.Binary;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="CarDetails")
public class CarDetails {
	private String cartype;
	private String modelno;
	private String nameplateno;
	private Binary carimage;
	
	
	public CarDetails(String cartype, String modelno, String nameplateno, Binary carimage) {
		super();
		this.cartype = cartype;
		this.modelno = modelno;
		this.nameplateno = nameplateno;
		this.carimage = carimage;
	}
	public String getCartype() {
		return cartype;
	}
	public void setCartype(String cartype) {
		this.cartype = cartype;
	}
	public String getModelno() {
		return modelno;
	}
	public void setModelno(String modelno) {
		this.modelno = modelno;
	}
	public String getNameplateno() {
		return nameplateno;
	}
	public void setNameplateno(String nameplateno) {
		this.nameplateno = nameplateno;
	}
	public Binary getCarimage() {
		return carimage;
	}
	public void setCarimage(Binary carimage) {
		this.carimage = carimage;
	}
	
}
