package com.java8.string.practice;

import java.util.List;
import java.util.stream.Collectors;

public class AnargramAndPalindromeString {

	public static void main(String[] args) {

		String str1 = "abcdef";
		String str2 = "edcafb";
		String str3 = "edcafbm";

		String str4 = "fedcba";
		StringBuffer str5 = new StringBuffer("abcdef");

		System.out.println(isAnargramOrNot(str1, str3));
		System.out.println(isAnargramOrNot(str2, str3));
		System.out.println(isPalindromeOrNot(str4, str5));

	}

	private static Boolean isPalindromeOrNot(String str4, StringBuffer str5) {
		return (str5.reverse().toString()).equals(str4);
	}

	private static Boolean isAnargramOrNot(String str1, String str2) {

		// List<Character> listCharFirst = str1.chars().mapToObj(ch ->
		// (char)ch).collect(Collectors.toList());
		// List<Character> listCharSecond = str2.chars().mapToObj(ch ->
		// (char)ch).collect(Collectors.toList());

		List<Character> listCharFirstSorted = str1.chars().mapToObj(ch -> (char) ch).collect(Collectors.toList())
				.stream().sorted().collect(Collectors.toList());
		
		System.out.println("listCharFirstSorted"+listCharFirstSorted);
		
		List<Character> listCharSecondSorted = str2.chars().mapToObj(ch -> (char) ch).collect(Collectors.toList())
				.stream().sorted().collect(Collectors.toList());
		
		System.out.println("listCharSecondSorted"+listCharSecondSorted);
		
		
		//List<Character>  lsitChar =  str1.chars().mapToObj(x-> (char)x).collect(collector)

		return listCharSecondSorted.equals(listCharFirstSorted);
	}
}
