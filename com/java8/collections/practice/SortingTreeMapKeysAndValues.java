package com.java8.collections.practice;

import java.util.Map;
import java.util.TreeMap;

public class SortingTreeMapKeysAndValues {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new TreeMap<>();
        // Adding elements to the Map
        // using standard add() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
        map.put("vishal1", 5);
        map.put("sachin2", 32);
        map.put("vaibhav3", 16);
        
        System.out.println(map);
	}

}
