package com.tvidushi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.tvidushi.model.Student;



public class TestSpringRestExample {
	
	
	public static final String URI = "http://localhost:8080/spring-rest-example";
	public static final String DUMMY_STUD = URI+"/rest/stud/dummy";
	public static final String GET_STUDENT = URI+"/rest/stud/{id}";
	public static final String GET_ALL = URI+"/rest/studs";
	public static final String CREATE = URI+"/rest/stud/create";
	public static final String DELETE = URI+"/rest/stud/delete/1";
	
	public void main(String args[]){
		
		testCreateStudent();
		testGetAllStudents();
		testGetEmployee();

	}

	
	public static void testCreateStudent(){
		RestTemplate restTemplate = new RestTemplate();
		Student student = new Student();
		student.setId(1);
		student.setName("vidushi");
		Student res = restTemplate.postForObject(CREATE, student, Student.class);  //uri,the object that is to passed, & returntype object expected
		
		System.out.println("ID = "+res.getId()+",Name = "+res.getName());
	}
	
	
	public static void testGetEmployee(){
		RestTemplate restTemplate = new RestTemplate();
		Student res = restTemplate.getForObject(GET_STUDENT,Student.class);
		System.out.println("ID = "+res.getId()+",Name = "+res.getName());
	}
	
	
	public static void testGetAllStudents(){
		RestTemplate restTemplate = new RestTemplate();
		List<Student> studentlist =(List) restTemplate.getForObject(GET_ALL, List.class);
		studentlist.forEach(student->{
			System.out.println("Id is :"+student.getId()+" "+student.getName());
		});
	}
	

	

}
