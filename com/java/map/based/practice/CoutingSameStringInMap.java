package com.java.map.based.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CoutingSameStringInMap {
	
	public static void main(String[] args) {
		
		String s = "This This is my my name";
		
		List<String> listString = Arrays.asList(s.split(" "));
		
		Map<String,Long>  mapObj =  listString.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(mapObj);
	}
	

}
