package com.tough.interview.practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindMaxListStringToListInteger {
	
	
	public static void main(String[] args) {
		
		
		//Converting String to Integer
		List<String>  listString =  Stream.of("12","11","16","10","9","54","2").collect(Collectors.toList());
		
		List<Integer> listInteger= listString.stream().map(Integer::parseInt).collect(Collectors.toList());
		System.out.println(listInteger);
		// Converting Integer to String
		System.out.println(listInteger.stream().map(String::valueOf).collect(Collectors.toList()));
		
		//Output -> [2,9,10,11,12,16,54]
		
		
	}

}
