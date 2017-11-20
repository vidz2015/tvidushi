package com.tvidushi;

import java.util.LinkedHashMap;

import org.springframework.web.client.RestTemplate;

import com.tvidushi.model.Student;

public class TestSpringRestExample {
	
	
	public static final String URI = "http://localhost:8080/spring-rest-example";
	
	public void main(String args[]){
		
		testCreateStudent();
	}

	
	public static void testCreateStudent(){
		RestTemplate restTemplate = new RestTemplate();
		Student student = new Student();
		student.setId(1);
		student.setName("vidushi");
		Student res = restTemplate.postForObject(URI+"/rest/stud/create", student, Student.class);  //uri,the object that is to passed, & returntype object expected
		
		System.out.println("ID = "+res.getId()+",Name = "+res.getName());
	}
	
	
	public static void testGetAllStudents(){
		RestTemplate restTemplate = new RestTemplate();
		
		LinkedHashMap<Student> hashMap = restTemplate.getForObject(url, responseType, urlVariables)
		
		
		
	}
	

	
	public static void testGetEmployee(){
		RestTemplate restTemplate = new RestTemplate();
	}
	
	public static void testGetDummyEmployee(){
		RestTemplate restTemplate = new RestTemplate();
	}
	
	

}
