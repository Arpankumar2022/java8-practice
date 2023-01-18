package com.java.array.based.programmes;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayToMapGroupingByFunctionIdentity {

	public static void main(String[] args) {

		String[] anumalsString = { "dog", "cat", "pony", "pony", "pony", "dog" };

		// Function.identity() will returns its input arguments
		
		System.out.println(Arrays.asList(anumalsString).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

	}

}
