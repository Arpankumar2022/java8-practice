package com.java8.practice;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationCollectCountMethodUseInJava {

	public static void main(String[] args) {

		// List<Integer> listInteger =
		// Stream.of(10,20,30,34,45,67).collect(Collectors.toList());
		// List<Integer> filteredInteger = listInteger.stream().filter(a->
		// a>20).collect(Collectors.toList());

		// Terminal Operation count
		long count = Stream.of(10, 20, 30, 34, 45, 67).collect(Collectors.toList()).stream().filter(a -> a > 20)
				.collect(Collectors.toList()).stream().count();
		System.out.println(count);

		// Terminal Operation Min value
		Integer minValue = Stream.of(10, 20, 30, 34, 45, 67).collect(Collectors.toList()).stream()
				.min((m1, m2) -> m1.compareTo(m2)).get();
		System.out.println(minValue);

		// Terminal Operation Max value
		Integer maxValue = Stream.of(10, 20, 30, 34, 45, 67).collect(Collectors.toList()).stream()
				.max((m1, m2) -> m1.compareTo(m2)).get();
		System.out.println(maxValue);

	}

}
