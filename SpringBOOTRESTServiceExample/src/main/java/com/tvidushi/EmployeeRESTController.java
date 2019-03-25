package com.tvidushi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRESTController {
	
	
	@GetMapping("/employee")
	public Employee getEmployee(){
		return new Employee("John","Smith","HR",30);
	}
	
	
	@PostMapping("/postEmployee")
	public void postEmployee(@RequestBody Employee employee){
		System.out.println(employee);
		
	}
	
	

}
