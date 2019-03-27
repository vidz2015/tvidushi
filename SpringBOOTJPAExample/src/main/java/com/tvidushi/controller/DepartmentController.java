package com.tvidushi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tvidushi.model.Department;
import com.tvidushi.repositary.DepartmentRepository;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	DepartmentRepository departmentrepository;
	
	@GetMapping("/all")
	public List<Department> getAllDepartments(){
		return departmentrepository.findAll();
	}
	


	@PostMapping("/pe")
	public String addDepartment(@RequestBody String department){
		return department;
		
	}
	

	
	
}
