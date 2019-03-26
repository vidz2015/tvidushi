package com.tvidushi.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tvidushi.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
