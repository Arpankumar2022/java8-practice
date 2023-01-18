package com.java.array.based.programmes;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOccurenceCountOfArray {

	public static void main(String[] args) {

		int[] firstArrayInt = { 12, 9, 12, 9, 10, 9, 10, 11 };
		
		//Map<Integer, Integer> mapOccurence = Arrays.stream(firstArrayInt).mapToObj(x-> (Integer)x).collect(Collectors.toList())
		//		.stream().collect(Collectors.toMap(Integer::intValue, Collectors.counting()));
				
			/*	Map<String, String> result1 = peopleList.stream().sorted(Comparator.comparingInt(Person::getAge))
				.collect(Collectors.toMap(Person::getName, Person::getCity, // key = name, value = websites
						(oldValue, newValue) -> oldValue, // if same key, take the old key
						LinkedHashMap::new // returns a LinkedHashMap, keep order
				));

		System.out.println(result1);*/

		

	}

}
