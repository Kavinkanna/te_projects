package com.te.springboot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*" , allowedHeaders = "*")
@RestController
public class SpringBootController {

	@GetMapping("/")
	public String firstHandlerMethod() {
		return "TechnoElevate";
	}
	
	@GetMapping("/data/{bid}")
	public String getData(@PathVariable(name = "bid")Long bid, @RequestParam(name = "id") List<Long> ids ) {
		System.out.println(bid);
		for (Long long1 : ids) {
			System.out.println(long1);
		}
		return null;
	}
}
