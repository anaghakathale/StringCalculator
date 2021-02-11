package com.dummy.string.calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

	public int add(String numbers) {
		int count = 0;
		if (null == numbers || "".equalsIgnoreCase(numbers)) {
			return 0;
		}
		String[] splitString = numbers.split("[\n,"+getDefaultDelimeter(numbers)+"]");
		for(int i=0;i<splitString.length;i++) {
			if (!"".equalsIgnoreCase(splitString[i])) {
				count = count + Integer.parseInt(splitString[i]);
			}
			
		}
		return count;
	}
	
	public String getDefaultDelimeter(String number) {
		Pattern pattern = Pattern.compile("[\n^[0-9]]+", Pattern.CANON_EQ);
		Matcher matcher = pattern.matcher(number);
		boolean matchFound = matcher.find();
		
		return matchFound ? number.split("[\n^[0-9]]+")[0] : "";
	}
}
