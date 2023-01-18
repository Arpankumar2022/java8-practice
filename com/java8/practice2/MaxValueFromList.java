package com.java8.practice2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxValueFromList {

	public static void main(String[] args) {
		
		List<Integer> myList = Stream.of(10, 15, 8, 49, 25, 98, 98, 32, 15).collect(Collectors.toList());
		//myList.stream().collect(Collectors.toList().)
		
		System.out.println(myList.stream().max(Integer::compare).get());
	}

}
