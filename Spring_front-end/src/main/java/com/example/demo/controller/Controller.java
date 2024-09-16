package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/percentage")

public class Controller {
	
	@PostMapping
	public String findPercentage(@RequestParam String name,@RequestParam double sub1,@RequestParam double sub2,
			@RequestParam double sub3,@RequestParam double sub4,@RequestParam double sub5) {
		
		double percentage=((sub1+sub2+sub3+sub4+sub5)/5);
		return "Hey "+name+", your percentage = "+percentage;
	
	}

}
