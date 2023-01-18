package com.java8.practice;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListLargeStringValueFetch {
	public static void main(String[] args) {

		List<String> listStr = Stream.of("abc", "ccbchsnshsnsh", "abcgdg", "bsnsnnsns", "abchsnshsnsh")
				.collect(Collectors.toList());

		System.out.println(Collections.min(listStr, Comparator.comparing(String::length)));
		System.out.println(Collections.max(listStr, Comparator.comparing(String::length)));

		/*
		 * Person minByAge = people .stream() .min(Comparator.comparing(Person::getAge))
		 * .orElseThrow(NoSuchElementException::new);
		 */

	}

}
