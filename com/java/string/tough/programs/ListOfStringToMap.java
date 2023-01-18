package com.java.string.tough.programs;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListOfStringToMap {

	public static void main(String[] args) {

		List<String> listStr = Stream.of("apple", "banana", "apricot", "orange", "apple", "banana")
				.collect(Collectors.toList());

		Map<String, Long> mapObj = listStr.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(mapObj);

	}

}
