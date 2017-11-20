package com.tvidushi.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.tvidushi.model.Student;


@Controller
public class StudentController {
	
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	//Map to store employees, ideally we should use database
		Map<Integer, Student> studentData = new HashMap<Integer, Student>();
		
		
		
		@RequestMapping(value="/rest/stud/create",method = RequestMethod.POST)
		public @ResponseBody Student createStudent(@RequestBody Student student){
			logger.info(" create a new record ");
			return null;
		}
		

	
		@RequestMapping(value= "/rest/stud",method=RequestMethod.GET)
		public @ResponseBody Student getStudent(){
			logger.info(" Get student");
			Student student = new Student();
			student.setId(1);
			student.setName("Vidushi");
			studentData.put(student.getId(), student);
	        return student;
		}
		
		
		
		
		@RequestMapping(value="/rest/stud/{id}")
		public @ResponseBody Student getStudent(@PathVariable("id") int stud_id){
			logger.info(" Get student based on id");
			return studentData.get(stud_id);
		}
		
		
		
		@RequestMapping(value="/rest/studs" ,method=RequestMethod.GET)
		public @ResponseBody List<Student> getAllStudents(){
			logger.info(" Get all the student");
			List<Student> students = new ArrayList<Student>();
			Set<Integer> student_keys = studentData.keySet();
		    for(Integer i :student_keys){
		    	students.add(studentData.get(i));
		    }
			return students;
		}
		
		
		
		@RequestMapping(value="/rest/stud/delete/{id}" ,method=RequestMethod.DELETE)
		public @ResponseBody Student deleteStudent(@PathVariable("id") int id){
			logger.info(" delete record based on student id");
			studentData.remove(id);
			
			return null;
		}
		
	




}
