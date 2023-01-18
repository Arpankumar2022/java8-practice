package com.java8.collections.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortHashMapByValues {
	

		public static void main(String[] args) {

			// creating HashMap
			Map<String, Integer> namesAges = new HashMap<>();

			// storing the values
			namesAges.put("Hari", 35);
			namesAges.put("Jhon", 30);
			namesAges.put("Jakey", 50);
			namesAges.put("kane", 45);

			Map<String, Integer> sortByValueMap = namesAges.entrySet().stream().sorted(Entry.comparingByValue())
					.collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue(),
							(entry1, entry2) -> entry2, LinkedHashMap::new));

			System.out.println("HashMap before sorting by value - " + namesAges);
			System.out.println("HashMap after sorting by value - " + sortByValueMap);
		}

	}


