package com.delegrego.exemplo_spring_boot_1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String helloWorld() {
		return "Hello, world!";
	}

}
