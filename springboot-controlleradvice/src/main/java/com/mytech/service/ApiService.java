package com.mytech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytech.entity.Product;
import com.mytech.exception.advice.InputElementException;
import com.mytech.repo.ApiRepo;

@Service
public class ApiService {

	@Autowired
	ApiRepo apiRepo;

	public Product saveProduct(Product product) {
		System.out.println("Inside saveProduct Service.......");
		if(product.getProductName().isEmpty() || (product.getProductPrice() == null || product.getProductPrice() < 0) ) {
			throw new InputElementException(2000,"Please verify input once");
		}
		return apiRepo.save(product);
	}
}
