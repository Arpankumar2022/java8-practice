package com.tough.interview.practice;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SubStringCharArrayExample {
	
	public static void main(String[] args) {
		 
		Integer intValue = new Integer(123);
		
		String str = "arpankumar";
		char c = '1';
		
		char[] ch=str.toCharArray();
		
		System.out.println(Objects.equals(intValue.toString().charAt(0),c));
		
		List<Integer> listInteger = Stream.of(122, 415, 24, 119, 39, 27, 7, 111, 17, 28).collect(Collectors.toList());

		
		//System.out.println(listInteger.stream().map(a->a.toString().toCharArray()[0]));
		
		//System.out.println(ch[0]);

		
	}

}
