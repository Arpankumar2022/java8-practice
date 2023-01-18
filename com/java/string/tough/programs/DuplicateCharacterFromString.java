package com.java.string.tough.programs;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateCharacterFromString {

	public static void main(String[] args) {

		String str = "edcafbmmanaoakaisdekel";

		List<Character> listChar = str.chars().mapToObj(x -> (char) x).collect(Collectors.toList());

		System.out.println(listChar.stream()
				.filter(a -> Collections.frequency(listChar, a) > 1).distinct().collect(Collectors.toList()));

	}

}
