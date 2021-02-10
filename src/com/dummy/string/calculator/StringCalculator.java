package com.dummy.string.calculator;

public class StringCalculator {

	public int add(String numbers) {
		int count = 0;
		if (null == numbers || "".equalsIgnoreCase(numbers)) {
			return 0;
		}
		String[] splitString = numbers.split("[\n,]");
		for(int i=0;i<splitString.length;i++) {
			count = count + Integer.parseInt(splitString[i]);
		}
		return count;
	}
}
