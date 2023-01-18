package com.java8.string.practice;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RepeatedCharCountInString {

	public static void main(String[] args) {

		String strValue = "HelloThisIsArpan";

		// Stream<Character> strChar = strValue.chars().mapToObj(x -> (char) x);

		// List<Character> listChar = strValue.chars().mapToObj(x -> (char)
		// x).collect(Collectors.toList());

		/**
		 * To find duplicate values from List of Characters
		 *
		 */
		/*
		 * Map<Character, Long> mapCount = strValue.chars().mapToObj(x -> (char)
		 * x).collect(Collectors.groupingBy(ch-> ch ,Collectors.counting()));
		 * 
		 * System.out.println(mapCount);
		 */

		/**
		 * Set<Charcter> setChar = new HashSet<>() Approach
		 * 
		 */
		List<Character> listChar = strValue.chars().mapToObj(x -> (char) x).collect(Collectors.toList());
		Set<Character> items = new HashSet<>();
		Set<Character> result = listChar.stream().filter(x -> !items.add(Character.toLowerCase(x))).collect(Collectors.toSet());
		System.out.println(result);
		/**
		 * Collections.frequency Approach
		 */
		Set<Character> resultCollectionsFrequencyApproach = listChar.stream().filter(x -> Collections.frequency(listChar, x)>1)
				.collect(Collectors.toSet());
		System.out.println("Collections.frequency Approach"+resultCollectionsFrequencyApproach);

	}

}
