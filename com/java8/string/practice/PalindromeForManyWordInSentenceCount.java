package com.java8.string.practice;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class PalindromeForManyWordInSentenceCount {

	public static void main(String[] args) {

		String str = "the fastest racecar";
		String str1 = "wow mom";
		String str2 = "nest test cow admda";
		String str3 = "eat ate rat";

		System.out.println(palindromeForManyWordInSentenceCountMethod(str));

		System.out.println(palindromeForManyWordInSentenceCountMethod(str1));
		
		System.out.println(palindromeForManyWordInSentenceCountMethod(str2));

		System.out.println(palindromeForManyWordInSentenceCountMethod(str3));

	}

	private static int palindromeForManyWordInSentenceCountMethod(String str) {
		return (Arrays.asList(str.split(" "))).stream()
				.filter(x -> Objects.equals((new StringBuffer(x)).reverse().toString(), x)).collect(Collectors.toList())
				.size();
	}

}
