package com.dj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping("/")
	public String main() {
		return "home";
	}

}
