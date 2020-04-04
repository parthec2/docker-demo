package com.example.demo.docker.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

	@GetMapping(path="/helloworld")
	public String HelloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path="/helloworld/{msg}")
	public String HelloWorldMsg(@PathVariable String msg) {
		return "Hello World "+ msg;
	}
	
	@GetMapping(path="/helloworldBean")
	public HelloWorld HelloWorldBean() {
		HelloWorld obj = new HelloWorld();
		obj.setMessage("Hello World Bean");
		return obj;
	}
}
