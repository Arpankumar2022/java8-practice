package com.java8.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FindFirstCharOneJava8 {

	public static void main(String[] args) {

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		
		myList.stream().map(x -> x.toString()).collect(Collectors.toList()).stream()
				.filter(x -> Objects.equals(x.charAt(0), '1')).collect(Collectors.toList()).forEach(System.out::println);
	}

}
