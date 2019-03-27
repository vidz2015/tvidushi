package com.tvidushi.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String house_no;
	private String streetname;
	private String city;
	private String zipcode;

	public Address(String house_no, String streetname, String city, String zipcode) {
		this.house_no = house_no;
		this.streetname = streetname;
		this.city = city;
		this.zipcode = zipcode;
	}

	public Address() {
	}

	public String getHouse_no() {
		return house_no;
	}

	public void setHouse_no(String house_no) {
		this.house_no = house_no;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
