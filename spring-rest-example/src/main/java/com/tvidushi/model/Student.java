package com.tvidushi.model;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable{
	
	private static final long serialVersionUID = -7788619177798333712L;
	
	private Integer id;
	private String name;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		 this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	

}
