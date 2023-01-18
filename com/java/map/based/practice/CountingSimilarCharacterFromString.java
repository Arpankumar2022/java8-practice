package com.java.map.based.practice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingSimilarCharacterFromString {

	public static void main(String[] args) {

		String str = "Arpan";

		Map<String, Long> objResult = str.chars().mapToObj(x -> (char) x).collect(Collectors.toList()).stream()
				.map(x -> x.toString().toLowerCase()).collect(Collectors.toList()).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(objResult);
	}

}
