package com.java.array.based.programmes;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class SecondLargestValueFromArray {

	public static void main(String[] args) {

		int[] inputArray = { 10, 44, 5, 77, 33, 34, 15, 111 };

		// System.out.println((Arrays.stream(inputArray).mapToObj(x -> (Integer) x).collect(Collectors.toList()).stream()
		//		.sorted().collect(Collectors.toList()).stream().findFirst()).get());
		
		System.out.println((Arrays.stream(inputArray).mapToObj(x -> (Integer) x).collect(Collectors.toList()).stream()
						.sorted(Collections.reverseOrder()).collect(Collectors.toList()).get(1)));

	}

}
