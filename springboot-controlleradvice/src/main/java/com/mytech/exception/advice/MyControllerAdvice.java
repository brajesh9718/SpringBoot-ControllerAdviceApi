package com.mytech.exception.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyControllerAdvice {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> exceptionHandler(Exception ex) {
		System.out.println("Inside exceptionHandler ControllerAdvice...");
		if (ex instanceof InputElementException) {
			InputElementException elementException = (InputElementException) ex;
			return new ResponseEntity<String>(elementException.getErrorMsg(), HttpStatus.BAD_REQUEST);
		}
		return null;
	}
}
