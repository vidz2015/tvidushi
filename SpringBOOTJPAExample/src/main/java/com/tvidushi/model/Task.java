package com.tvidushi.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int task_id;

	@Column(name = "task_name")
	String task_name;

	@Column(name = "details")
	String task_details;

	@Column(name = "deadline")
	LocalDate deadline;

	public String getTask_name() {
		return task_name;
	}

	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}

	public int getTask_id() {
		return task_id;
	}

	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}

	public String getTask_details() {
		return task_details;
	}

	public void setTask_details(String task_details) {
		this.task_details = task_details;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	/*
	 * @ManyToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "employee_id") Employee employee;
	 * 
	 * @ManyToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "id") Department department;
	 * 
	 */
	/*
	 * public Employee getEmployee() { return employee; }
	 * 
	 * public void setEmployee(Employee employee) { this.employee = employee; }
	 * 
	 * public Department getDepartment() { return department; }
	 * 
	 * public void setDepartment(Department department) { this.department =
	 * department; }
	 */

}
