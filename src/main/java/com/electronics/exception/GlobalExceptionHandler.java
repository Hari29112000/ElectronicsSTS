package com.electronics.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(NameNotFoundException.class)
	public ResponseEntity<Object> nameNot(NameNotFoundException ne){
		return new ResponseEntity<>(ne.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<Object> num(ArithmeticException ne){
		return new ResponseEntity<>(ne.getMessage(),HttpStatus.BAD_REQUEST);
	}

}
