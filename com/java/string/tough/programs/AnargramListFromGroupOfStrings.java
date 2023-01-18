package com.java.string.tough.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class AnargramListFromGroupOfStrings {

	public static void main(String[] args) {

		String[] strArray = { "eat", "ate", "rat", "tea", "nat", "tan" };

		// o/p:[[eat, tea, ate], [rat], [tan, nat]]

		// List<String> listStr = Arrays.asList(strArray);

		List<String> listOfOneGroup = new ArrayList<>();

		List<String> finalOutPut = new ArrayList<>();

		for (int i = 0; i < strArray.length; i++) {

			String string = strArray[i];

			listOfOneGroup.add(string);

			for (int j = i + 1; j < strArray.length; j++) {

				if (isAnargram(string, strArray[j])) {
					listOfOneGroup.add(strArray[j]);
				} else
					continue;

			}

			finalOutPut.addAll(listOfOneGroup);
			listOfOneGroup.clear();

		}
		System.out.println(finalOutPut);

	}

	private static Boolean isAnargram(String str1, String str2) {
		return Objects.equals(sortedListOfChatacterOfGivenString(str1), sortedListOfChatacterOfGivenString(str2));

	}

	private static List<Character> sortedListOfChatacterOfGivenString(String str) {
		System.out.println(str.chars().mapToObj(x -> (char) x).collect(Collectors.toList()).stream().sorted()
				.collect(Collectors.toList()));
		return str.chars().mapToObj(x -> (char) x).collect(Collectors.toList()).stream().sorted()
				.collect(Collectors.toList());

	}

}
