 package com.example.SpringAzure;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

	@RequestMapping("/hello")
	public String sayHello()
	{
		return " Hello Spring boot";
	}
}
