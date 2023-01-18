package com.java8.practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8.practice.Entity.Employee;

public class ListToMapEmployee {

	public static void main(String[] args) {

		Employee emp = new Employee(Long.valueOf("1"), "abc", "def", "rge", "rget", "IT");
		Employee emp1 = new Employee(Long.valueOf("4"), "abce", "def", "rge", "rget", "CSE");
		Employee emp2 = new Employee(Long.valueOf("10"), "abc", "def", "rge", "rgeth", "IT");
		Employee emp3 = new Employee(Long.valueOf("34"), "abc", "def", "rgeh", "rget", "CSE");
		Employee emp4 = new Employee(Long.valueOf("56"), "abc", "defh", "rgeh", "rget", "ME");
		
		List<Employee>  listEmployee = Stream.of(emp,emp1,emp2,emp3,emp4).collect(Collectors.toList());
		
		Map<String, List<Employee>>  mapDepptListEmployee = listEmployee.stream().collect(Collectors.groupingBy(Employee::getName5));
		
		
		
		mapDepptListEmployee.entrySet().forEach(System.out::println);
		
		Map<String, List<Employee>>  mapObjectWithGroupingBy = listEmployee.stream().collect(Collectors.groupingBy(Employee::getName2));
				
		
		//System.out.println(mapObjectWithGroupingBy);
		
		
		
		//Map<String, List<Employee>>  mapDepptListEmployee = listEmployee.stream().collect(Collectors.toMap(Employee::getName5, valueMapper))
		

	}

}
