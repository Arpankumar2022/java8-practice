package com.tough.interview.practice;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateIntegerValueInList {
	
	public static void main(String[] args) {
		
		List<Integer> listInteger = Stream.of(122, 415, 24,28,122,34,111,27, 119, 39, 27, 7, 111, 17, 28).collect(Collectors.toList());
		//System.out.println(listInteger.stream().filter(a-> Objects.equals(listInteger.contains(a),Boolean.TRUE)).collect(Collectors.toList()));
		
		
		// Duplicate value from Stream List
		listInteger.stream().filter(i -> Collections.frequency(listInteger, i) >1).distinct()
       .collect(Collectors.toSet()).forEach(System.out::println);
		
		
		// Remove duplicate value from list oif objects
		listInteger.removeAll(listInteger.stream().filter(i -> Collections.frequency(listInteger, i) >1)
	       .collect(Collectors.toSet()));
		
		System.out.println(listInteger);

	}

}
