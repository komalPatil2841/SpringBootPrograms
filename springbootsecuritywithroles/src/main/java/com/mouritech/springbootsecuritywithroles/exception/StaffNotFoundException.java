package com.mouritech.springbootsecuritywithroles.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.HttpStatus;
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class StaffNotFoundException extends RuntimeException  {
	
	
	private static final long serialVersionUID = 3012878889525785180L;

	/**
	 * 
	 */
	

	public StaffNotFoundException(String message) {
		super(message);
	}
}