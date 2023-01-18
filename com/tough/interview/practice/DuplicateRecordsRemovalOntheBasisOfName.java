package com.tough.interview.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateRecordsRemovalOntheBasisOfName {

	public static void main(String[] args) {

		List<Person> peopleList = new ArrayList<>();

		peopleList.add(new Person("John", "London", 21));
		peopleList.add(new Person("Swann", "London", 21));
		peopleList.add(new Person("Kevin", "London", 23));
		peopleList.add(new Person("Monobo", "Tokyo", 23));
		peopleList.add(new Person("Sam", "Paris", 23));
		peopleList.add(new Person("Nadal", "Paris", 31));

		Map<String, Person> mapPersonList = new HashMap<>();
		
		//mapPersonList.entrySet().stream().filter(personObj-> !mapPersonList.containsKey(personObj.getCity())
		//		return mapPersonList.put(personObj.getCity(), personObj)).collect(Collectors.toList());

		for (Person personObj : peopleList) {
			if (!mapPersonList.containsKey(personObj.getCity())) {
				mapPersonList.put(personObj.getCity(), personObj);
			}
		}
		
		System.out.println(mapPersonList);

	}

}
