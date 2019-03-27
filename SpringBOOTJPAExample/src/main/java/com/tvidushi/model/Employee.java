package com.tvidushi.model;


import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "employee")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Employee {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long employee_id;

	@Column(name = "emp_name", nullable = false)
	private String emp_name;

	//@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL, mappedBy = "employee")
	//private Contact contact;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "dept_id")
	@JsonBackReference
	private Department department;
	

	@Embedded
	private Address address;

	// @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy =
	// "employee")
	// private Department department;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Long getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Long employee_id) {
		this.employee_id = employee_id;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

/*	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
*/
}
