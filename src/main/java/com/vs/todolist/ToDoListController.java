package com.vs.todolist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoListController {

	@RequestMapping("/hello")
	public String sayHi()
	{
		return "Hey VS";
	}
}
