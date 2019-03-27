package com.tvidushi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tvidushi.exception.NoRecordException;
import com.tvidushi.model.Employee;
import com.tvidushi.repositary.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeerepository;

	@GetMapping("/all")
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList = employeerepository.findAll();
		return employeeList;
	}

	@GetMapping("id/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable Long id) {
		if (employeerepository.existsById(id)) {
			Optional<Employee> employee = employeerepository.findById(id);
			return employee;
		} else
			throw new NoRecordException("No record exists");

	}

	@GetMapping("/n")
	public List<Employee> getEmployeeByName(@RequestParam String name) {
		List<Employee> employee = employeerepository.findByName(name);
		return employee;

	}

	@PostMapping("/save")
	public void addEmployee(@RequestBody Employee employee) {
		employeerepository.save(employee);
	}

	@PutMapping("/update")
	public void updateEmployee(@RequestBody Employee employee) {
		if (employeerepository.existsById(employee.getEmployee_id()))
			employeerepository.save(employee);
		else
			throw new NoRecordException("No record exists");

	}
}
