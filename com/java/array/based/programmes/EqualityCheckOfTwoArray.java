package com.java.array.based.programmes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EqualityCheckOfTwoArray {

	public static void main(String[] args) {

		int[] inputArray = { 10, 44, 5, 77, 33, 34, 15, 111 };

		int[] inputArray2 = { 10, 44, 56, 33, 5, 15, 111, 77 };
		
		int[] inputArray3 = { 10, 44, 34, 33, 5, 15, 111, 77 };

		List<Integer> firstArraySorted = Arrays.stream(inputArray).mapToObj(x -> (Integer) x)
				.collect(Collectors.toList()).stream().sorted().collect(Collectors.toList());

		List<Integer> SecondArraySorted = Arrays.stream(inputArray2).mapToObj(x -> (Integer) x)
				.collect(Collectors.toList()).stream().sorted().collect(Collectors.toList());
		
		List<Integer> thirdArraySorted = Arrays.stream(inputArray3).mapToObj(x -> (Integer) x)
				.collect(Collectors.toList()).stream().sorted().collect(Collectors.toList());

		System.out.println(firstArraySorted.equals(SecondArraySorted));
		
		System.out.println(firstArraySorted.equals(thirdArraySorted));

	}

}
