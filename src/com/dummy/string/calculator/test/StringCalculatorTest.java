package com.dummy.string.calculator.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.dummy.string.calculator.MyException;
import com.dummy.string.calculator.StringCalculator;

class StringCalculatorTest {
	
	@Test
	void testForBlankString() throws MyException {
		StringCalculator calc = new StringCalculator();
		int result = calc.add("");
		assertEquals(0, result);
	}
	
	@Test
	void testForNullString() throws MyException {
		StringCalculator calc = new StringCalculator();
		int result = calc.add(null);
		assertEquals(0, result);
	}
	
	@Test
	void testForSplitByComma() throws MyException {
		StringCalculator stringCalculator = new StringCalculator();
		int result = stringCalculator.add("12,13,1,56");
		assertEquals(82, result);
	}
	
	@Test
	void testForNewLineCharacter() throws MyException {
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
	
	@Test()
	void testAdditionForDefaultDelimeter() throws MyException {
		StringCalculator stringCalculator = new StringCalculator();
		int result = stringCalculator.add(";\n1;2");
		assertEquals(3, result);
	}
	
	@Test
	void testdelimerOfAnyLength() throws MyException {
		StringCalculator stringCalculator = new StringCalculator();
		int result = stringCalculator.add("***\n1***2***3");
		assertEquals(6, result);
	}
	
	@Test
	void testToThrowExceptionForNegativeNumber() {
		StringCalculator stringCalculator = new StringCalculator();
		MyException ex = assertThrows(MyException.class, () -> stringCalculator.add(";\n1;-2"));
		assertEquals("negatives not allowed", ex.getMessage());
	}
	
	@Test
	void testToThrowExceptionIncludingNumber() {
		StringCalculator stringCalculator = new StringCalculator();
		MyException ex = assertThrows(MyException.class, () -> stringCalculator.add(";\n1;-2;-66"));
		List<String> list = new ArrayList<String>();
		list.add("-2");
		assertEquals(list, ex.getNegativeNumbers());
	}
}
