package com.java8.practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummingIntegerValueFromList {
	
	public static void main(String[] args) {
		
		int[] inputArray = { 111, 333, 555, 777, 333, 444, 555, 111 };
		
		List<Integer>  listInteger =  Arrays.stream(inputArray).mapToObj(x-> (Integer)x).collect(Collectors.toList());
		Integer intValue = listInteger.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println(intValue);
		
	}

}
