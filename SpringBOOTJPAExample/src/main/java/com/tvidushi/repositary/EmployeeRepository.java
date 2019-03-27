package com.tvidushi.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tvidushi.model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>,EmployeeRepositoryCustom {
 

}
