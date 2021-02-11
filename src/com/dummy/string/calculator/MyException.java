package com.dummy.string.calculator;

import java.util.List;

public class MyException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private String message;
	private List<String> negativeNumbers;

	public MyException() {
		
	}
	
	public MyException(String message,List<String> negativeNumbers) {
		super();
		this.message = message;
		this.negativeNumbers = negativeNumbers;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getNegativeNumbers() {
		return negativeNumbers;
	}

	public void setNegativeNumbers(List<String> negativeNumbers) {
		this.negativeNumbers = negativeNumbers;
	}
	
	

}
