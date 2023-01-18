package com.tough.interview.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConversionToMap {

	public static void main(String[] args) {
		
		List<Person> peopleList = new ArrayList<>();

		peopleList.add(new Person("John", "London", 21));
		//peopleList.add(new Person("Swann", "London", 21));
		//peopleList.add(new Person("Kevin", "London", 23));
		peopleList.add(new Person("Monobo", "Tokyo", 23));
		peopleList.add(new Person("Sam", "Paris", 23));
		//peopleList.add(new Person("Nadal", "Paris", 31));
		
		// Collectors.toMap does not work for duplicate key
		
		Map<String, Person>  mapList = peopleList.stream().collect(Collectors.toMap(Person::getCity,person->person));
		mapList.entrySet().forEach(System.out::println);
		

				
				
				
				
     				
	}

}
