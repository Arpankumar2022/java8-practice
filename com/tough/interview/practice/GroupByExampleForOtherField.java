package com.tough.interview.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExampleForOtherField {

	public static void main(String[] args) {

		List<Person> peopleList = new ArrayList<>();

		peopleList.add(new Person("John", "London", 21));
		peopleList.add(new Person("Swann", "London", 21));
		peopleList.add(new Person("Kevin", "London", 23));
		peopleList.add(new Person("Monobo", "Tokyo", 23));
		peopleList.add(new Person("Sam", "Paris", 23));
		peopleList.add(new Person("Nadal", "Paris", 31));
		
		Map<Integer, List<Person>>  listPersonGroup =   peopleList.stream().collect(Collectors.groupingBy(Person::getAge));
		
		listPersonGroup.entrySet().forEach(System.out::println);
		

	}

}
