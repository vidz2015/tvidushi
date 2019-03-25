package com.tvidushi;

import javax.xml.bind.annotation.XmlRootElement;

//@Getter @Setter @NoArgsConstructor 

public class Employee {

	private String firstName;
	private String lastName;
	private String department;
	private int age;
	
	public Employee(){
		
	}

	public Employee(String firstName, String lastName, String department, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.age = age;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", department=" + department + ", age="
				+ age + "]";
	}
	
	

}
