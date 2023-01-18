package com.java8.practice2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.tough.interview.practice.Person;

public class ListOfObjectsToMapHashMap {

	public static void main(String[] args) {
		List<Person> peopleList = new ArrayList<>();

		peopleList.add(new Person("John", "London", 21));
		peopleList.add(new Person("Swann", "London", 21));
		peopleList.add(new Person("Kevin", "London", 23));
		peopleList.add(new Person("Monobo", "Tokyo", 23));
		peopleList.add(new Person("Sam", "Paris", 23));
		peopleList.add(new Person("Nadal", "Paris", 31));

		// Duplicate error comes here
		/*
		 * Map<String, String> peopleListMap = peopleList.stream()
		 * .collect(Collectors.toMap(Person::getCity, Person::getName));
		 * System.out.println(peopleListMap);
		 */

		// Duplicate Error removal with old data duplicate
		Map<String, String> peopleListMapDuplicate = peopleList.stream()
				.collect(Collectors.toMap(Person::getCity, Person::getName, (oldValue, newValue) -> oldValue));
		System.out.println(peopleListMapDuplicate);

		// peopleListMapDuplicateNew with new value
		Map<String, String> peopleListMapDuplicateNew = peopleList.stream()
				.collect(Collectors.toMap(Person::getCity, Person::getName, (oldValue, newValue) -> newValue));
		System.out.println(peopleListMapDuplicateNew);

		// We have added here 4 parameters in Map conversion
		// --Convert a Map into a Stream
		// --Sort it
		// --Collect and return a new LinkedHashMap (keep the order)
		Map<String, String> result1 = peopleList.stream().sorted(Comparator.comparingInt(Person::getAge))
				.collect(Collectors.toMap(Person::getName, Person::getCity, // key = name, value = websites
						(oldValue, newValue) -> oldValue, // if same key, take the old key
						LinkedHashMap::new // returns a LinkedHashMap, keep order
				));

		System.out.println(result1);

	}

}
