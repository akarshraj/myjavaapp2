package com.ofss;

public class Address {
	String flatNo;
	String streetName;
	String city;
	
	
	public Address() {
		super();
	}

	public Address(String flatNo, String streetName, String city) {
		super();
		this.flatNo = flatNo;
		this.streetName = streetName;
		this.city = city;
	}

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [flatNo=" + flatNo + ", streetName=" + streetName + ", city=" + city + "]";
	}
	
	
	
}
