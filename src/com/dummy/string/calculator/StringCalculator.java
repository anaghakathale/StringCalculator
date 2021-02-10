package com.dummy.string.calculator;

public class StringCalculator {

	public int add(String numbers) {
		if (null == numbers || "".equalsIgnoreCase(numbers)) {
			return 0;
		}
		return 1;
	}
}
