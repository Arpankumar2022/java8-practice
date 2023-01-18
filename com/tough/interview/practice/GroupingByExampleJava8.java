package com.tough.interview.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExampleJava8 {
	
	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>(); 
		
		people.add(new Person("John", "London", 21)); 
		people.add(new Person("Swann", "London", 21));
		people.add(new Person("Kevin", "London", 23)); 
		people.add(new Person("Monobo", "Tokyo", 23)); 
		people.add(new Person("Sam", "Paris", 23)); 
		people.add(new Person("Nadal", "Paris", 31));

		Map<String,List<Person>> personByCity = people.stream().collect(Collectors.groupingBy(Person::getCity));
		
		//personByCity.entrySet().forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));
		  for (Map.Entry<String,List<Person>> personListMap : personByCity.entrySet()) {
			  System.out.println(personListMap);
			
		}
	}

}
