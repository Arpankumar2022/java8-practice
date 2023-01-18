package com.java8.practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodReferenceUsage {
	
	public static void main(String[] args) {
		List<String>  list = Stream.of("abc","def", "opw", "rst").collect(Collectors.toList());
		list.forEach(System.out::println);
	}

}
