package com.tvidushi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tvidushi.model.Task;
import com.tvidushi.repositary.TaskRepository;

@RestController
@RequestMapping("/task")
public class TaskController {
	
	TaskRepository taskrepository;
	
	@GetMapping("/w")
	public List<Task> getTaskByEmployeeId(){
		
		return null;
	}

	@PostMapping("/t")
	public List<Task> getListOfTasks(){
		
		return null;
	}
	
	@PostMapping("/v")
	public void getTaskByDepartment(){
		
	}
	
	
}
