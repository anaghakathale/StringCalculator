package com.dummy.string.calculator.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.dummy.string.calculator.StringCalculator;

class StringCalculatorTest {
	
	@Test
	void testForBlankString() {
		StringCalculator calc = new StringCalculator();
		int result = calc.add("");
		assertEquals(0, result);
	}
	
	@Test
	void testForNullString() {
		StringCalculator calc = new StringCalculator();
		int result = calc.add(null);
		assertEquals(0, result);
	}
	
	@Test
	void testForSplitByComma() {
		StringCalculator stringCalculator = new StringCalculator();
		int result = stringCalculator.add("12,13,1,56");
		assertEquals(82, result);
	}
	
	@Test
	void testForNewLineCharacter() {
		StringCalculator stringCalculator = new StringCalculator();
		int result = stringCalculator.add("12\n1,5");
		assertEquals(18, result);
	}
	
	@Test
	void testDefaultDelimeterAtBegining() {
		StringCalculator stringCalculator = new StringCalculator();
		String delimeter = stringCalculator.getDefaultDelimeter(";\n123");
		assertEquals(";", delimeter);
	}
	
	@Test
	void testAdditionForDefaultDelimeter() {
		StringCalculator stringCalculator = new StringCalculator();
		int result = stringCalculator.add(";\n1;2");
		assertEquals(3, result);
	}
}
