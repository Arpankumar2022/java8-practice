package com.java8.practice;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8.practice.Entity.Employee;

public class IntermediateOperationMethodsEmployee {

	public static void main(String[] args) {
		List<Integer> list1 = Stream.of(1, 2, 3).collect(Collectors.toList());
		List<Integer> list2 = Stream.of(4, 5, 6).collect(Collectors.toList());
		List<Integer> list3 = Stream.of(7, 8, 9).collect(Collectors.toList());

		Employee emp = new Employee(Long.valueOf("1"),"abc", "def", "rge", "rget", "rgey");
		Employee emp1 = new Employee(Long.valueOf("4"), "abce", "def", "rge", "rget", "rgey");
		Employee emp2 = new Employee(Long.valueOf("10"),"abc", "def", "rge", "rgeth", "rgey");
		Employee emp3 = new Employee(Long.valueOf("34"),"abc", "def", "rgeh", "rget", "rgey");
		Employee emp4 = new Employee(Long.valueOf("56"),"abc", "defh", "rgeh", "rget", "rgey");

		List<Employee> listEmployee = Stream.of(emp, emp1, emp2, emp3, emp4).collect(Collectors.toList());

		// filter
		listEmployee.stream().filter(x -> Objects.equals(x.getName1(), "abc")).collect((Collectors.toList()))
				.forEach(System.out::println);

		List<List<Integer>> listOfListObj = Stream.of(list1, list2, list3).collect(Collectors.toList());
		
		// flatMap
		listOfListObj.stream().flatMap(x -> x.stream()).collect(Collectors.toList()).forEach(System.out::println);

		// map
		Stream.of(1, 2, 3).collect(Collectors.toList()).stream().filter(x -> x > 2).collect(Collectors.toList())
				.forEach(System.out::println);

		listEmployee.stream().filter(x-> Objects.equals(x.getName1(), 
				"abc")).map(Employee::getName4).collect((Collectors.toList())).forEach(System.out::println);
		

	}

}
