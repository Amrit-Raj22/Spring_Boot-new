package com.spring.SpringBootDemo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "Hello Visitor";
	}
	@GetMapping("/task")
	public String task() {
		return "Task Demonstration";
	}
	
	@GetMapping("/task/showMyInfo")
	public String detail() {
		return "Name:Amrit\n "
				+ "CITY:city\n "
				+ "State:Bihar\n "
				+ "DreamJob:Sleeping";
	}
	
	@GetMapping("/task/showMyHobby")
	public List<String> hobbies() {
		return List.of("EAT","SLEEP","REPEAT");
	}
	
	
	
}
