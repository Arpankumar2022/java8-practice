package com.java.string.tough.programs;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterToMapWithCount {

	public static void main(String[] args) {

		String str = "edcafbmmanaoakaisdekel";

		List<Character> listChar = str.chars().mapToObj(x -> (char) x).collect(Collectors.toList());

		Map<Character, Long> mapObj = listChar.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(mapObj);

	}

}
