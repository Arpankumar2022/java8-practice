package com.tough.interview.practice;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StartWithOneFromListInteger {
	
	public static void main(String[] args) {
		
		
		List<Integer> listInteger = Stream.of(122, 415, 24, 119, 39, 27, 7, 111, 17, 28).collect(Collectors.toList());
		
		System.out.println(listInteger.stream().filter(a->Objects.equals(a.toString().charAt(0),'1')).collect(Collectors.toList()));
	}

}
 