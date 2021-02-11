package com.dummy.string.calculator;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String message;

	public MyException() {
		
	}
	
	public MyException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}