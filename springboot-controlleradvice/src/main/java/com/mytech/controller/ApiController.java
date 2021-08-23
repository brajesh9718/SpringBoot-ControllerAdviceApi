package com.mytech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mytech.entity.Product;
import com.mytech.service.ApiService;

@RestController
@RequestMapping("api")
public class ApiController {

	@Autowired
	ApiService apiService;
	
	@GetMapping("/")
	public String getMsg() {
		return "Welcome to Api !!!!";
	}
	
	@PostMapping("/product")
	public Product saveProduct(@RequestBody Product product) {
		System.out.println("Inside save product .......");
		return apiService.saveProduct(product);
	}
	
	
}
