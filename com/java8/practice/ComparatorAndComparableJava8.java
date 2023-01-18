package com.java8.practice;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8.practice.Entity.Employee;

public class ComparatorAndComparableJava8 {

	public static void main(String[] args) {

		Employee emp = new Employee(Long.valueOf("1"), "abc", "def", "rge", "rget", "rgey");
		Employee emp1 = new Employee(Long.valueOf("4"), "abce", "def", "rge", "rget", "rgey");
		Employee emp2 = new Employee(Long.valueOf("10"), "abc", "def", "rge", "rgeth", "rgey");
		Employee emp3 = new Employee(Long.valueOf("34"), "abc", "def", "rgeh", "rget", "rgey");
		Employee emp4 = new Employee(Long.valueOf("56"), "abc", "defh", "rgeh", "rget", "rgey");

		List<Employee> listEmployee = Stream.of(emp, emp1, emp2, emp3, emp4).collect(Collectors.toList());

		listEmployee.sort(Comparator.comparing(Employee::getName2
				).thenComparing(Employee::getId));
		
		//Collections.sort(listEmployee);

		// Let's print the sorted list
		System.out.println(listEmployee);

		//Collection.sort( listEmployee);
	}

}
