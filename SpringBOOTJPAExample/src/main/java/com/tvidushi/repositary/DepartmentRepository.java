package com.tvidushi.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tvidushi.model.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
