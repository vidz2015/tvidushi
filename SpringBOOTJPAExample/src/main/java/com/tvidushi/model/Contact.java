package com.tvidushi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "contact")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int contact_id;

	@Column(name = "phone_number")
	private String phone_number;

	//@OneToOne(fetch = FetchType.LAZY, optional = false)
	//@JoinColumn(name = "emp_id", nullable = false)
	//private Employee employee;

	public int getContact_id() {
		return contact_id;
	}

	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	/*public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}  */

}
