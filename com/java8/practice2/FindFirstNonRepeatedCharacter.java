package com.java8.practice2;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharacter {
    
	
	
	
	/*
	 * https://javahungry.blogspot.com/2020/05/java-8-coding-and-programming-interview-questions.html
	 */
	
	
	
	
	
	public static void main(String[] args) {

		String dummy = "abcdefghiah";
		/// Non repeated
		Character nonRepeated = dummy.chars() // Stream of String
				.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object
																					// and then to lowercase
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Store
																												// the
																												// chars
																												// in
																												// map
																												// with
																												// count
				.entrySet().stream().filter(entry -> entry.getValue() == 1L).map(entry -> entry.getKey()).findFirst()
				.get();

		// Repeated Character

		Character repeated = dummy.chars() // Stream of String
				.mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object
																					// and then to lowercase
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Store
																												// the
																												// chars
																												// in
																												// map
																												// with
																												// count
				.entrySet().stream().filter(entry -> entry.getValue() > 1L).map(entry -> entry.getKey()).findFirst()
				.get();

		Optional<char[]> chrValeu = Arrays.asList(dummy.toCharArray()).stream()
				.filter(x -> Collections.frequency(Arrays.asList(dummy.toCharArray()), x) > 1).findAny();

		// Optional<Character> chrValeu = Arrays.asList(dummy.toCharArray()).stream()
		// .filter(x -> Arrays.asList(dummy.toCharArray()).contains(x)).findFirst();

		if (chrValeu.isPresent())
			System.out.println(chrValeu.get());

	}

}
