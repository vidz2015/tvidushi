package com.tvidushi.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tvidushi.model.Task;
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}
