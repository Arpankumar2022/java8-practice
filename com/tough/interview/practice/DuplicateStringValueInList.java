package com.tough.interview.practice;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateStringValueInList {

	public static void main(String[] args) {
		
		List<String> listString = Stream.of("John", "Swann", "Kevin", "Monobo", "Sam", "Nadal", "London", "London",
				"London", "London", "Kevin", "John", "Johnad", "Londonwa", "Londonma").collect(Collectors.toList());
		
		listString.stream().filter(x-> Collections.frequency(listString , x)>1).collect(Collectors.toSet()).forEach(System.out::println);
		
		//Map<Integer,String>  duplicateStringWithCount = listString.stream().filter(x-> Collections.frequency(listString , x)>1).collect(collector)

	}

}
