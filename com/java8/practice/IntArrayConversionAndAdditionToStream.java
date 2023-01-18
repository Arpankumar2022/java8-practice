package com.java8.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntArrayConversionAndAdditionToStream {
	
	public static void main(String[] args) {
		
		int[]  intArray =  {10,23,34,55,22,12,67};
		
		int b  = Arrays.stream(intArray).sum();
		System.out.println(b);
		
		List<Integer>  listInt = Arrays.stream(intArray).mapToObj(x-> (Integer)x).collect(Collectors.toList());
		//listInt.stream().reduce((a,b), a+b);
		Integer i =  listInt.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println(i);
	}

}
