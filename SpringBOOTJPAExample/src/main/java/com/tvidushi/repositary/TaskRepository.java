package com.tvidushi.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tvidushi.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
