package com.tvidushi.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="task")
public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int task_id;
	@Column(name="task_name")
	String task_name;
	@Column(name="details")
	String task_details;
	@Column(name="deadline")
	LocalDate  deadline;
	
	
	
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
	
	

}
