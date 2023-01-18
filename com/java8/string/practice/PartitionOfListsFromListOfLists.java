package com.java8.string.practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitionOfListsFromListOfLists {

	public static void main(String[] args) {

		List<List<String>> listOfListString = Stream
				.of(Stream.of("eat", "ate", "tae", "eta").collect(Collectors.toList()),
						Stream.of("rat").collect(Collectors.toList()),
						Stream.of("tan", "nat").collect(Collectors.toList()))
				.collect(Collectors.toList());
		
		for (List<String> list : listOfListString) {
			// we can create another list of String here
		}

	}

}
