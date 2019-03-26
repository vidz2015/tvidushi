package com.tvidushi.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tvidushi.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
