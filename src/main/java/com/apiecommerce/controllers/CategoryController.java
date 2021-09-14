package com.apiecommerce.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/categories")
public class CategoryController {

	@GetMapping
	public String list() {
		return "Testando o Rest";
	}
	
}
