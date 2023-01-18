package com.java8.practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToUpperCaseJoinComma {

	public static void main(String[] args) {
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
		
		System.out.println(G7.stream().map(x-> x.toUpperCase()).collect(Collectors.joining(", ")));

	}

}
