package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainhome {

	@GetMapping("/home")
	public String home() {
		System.out.println("hellooooooos");
		return "<center><h2>this is displayed at 2nd commit<h2><center>";
	}
}
