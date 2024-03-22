package com.sk.springboot.demospringbootfirstapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@GetMapping("/Welcome")
	public String Welcome() {
		return "Welcome to Springboot app development";
	}
}
