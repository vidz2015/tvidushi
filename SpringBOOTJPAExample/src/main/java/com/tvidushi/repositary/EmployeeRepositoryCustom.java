package com.tvidushi.repositary;

import java.util.List;

//import org.springframework.data.repository.query.Param;

import com.tvidushi.model.Employee;

public interface EmployeeRepositoryCustom {
	
	 List<Employee> findByName(String name);

}
