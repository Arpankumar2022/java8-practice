package com.java8.string.practice;

import java.util.List;
import java.util.stream.Collectors;

public class StringAlphaNumericAddOfinteger {

	public static void main(String[] args) {

		String str = "abc12ncnbf3df5m7";

		String str1 = "a12b34c";
		
		String str2 = "123"; 
		System.out.println(additionOfNumbers(str));
		System.out.println(additionOfNumbers(str1));
		System.out.println(additionOfNumbers(str2));

	}

	private static int additionOfNumbers(String str) {

		List<Character> listChar = str.chars().mapToObj(x -> (char) x).collect(Collectors.toList()).stream()
				.filter(y -> Character.isDigit(y)).collect(Collectors.toList());

		// System.out.println(listChar);
		
		// Otherwise we have apache.lang NumberUtils.isNumber() , StringUtils.isString()
		

		return Integer.valueOf(listChar.stream().map(x -> Integer.parseInt(x.toString()))
				.collect(Collectors.summingInt(Integer::intValue)));

	}

}
