package com.cg.casestudy.carwash.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="AddressDetails")
public class Address {
	
private String state;
private String city;
private String locality;
private String blocknumber;
private String pin;
private String phoneno;

public Address(String state, String city, String locality, String blocknumber, String pin, String phoneno) {
	super();
	this.state = state;
	this.city = city;
	this.locality = locality;
	this.blocknumber = blocknumber;
	this.pin = pin;
	this.phoneno = phoneno;
}

public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getLocality() {
	return locality;
}
public void setLocality(String locality) {
	this.locality = locality;
}
public String getBlocknumber() {
	return blocknumber;
}
public void setBlocknumber(String blocknumber) {
	this.blocknumber = blocknumber;
}
public String getPin() {
	return pin;
}
public void setPin(String pin) {
	this.pin = pin;
}
public String getPhoneno() {
	return phoneno;
}
public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}

}
