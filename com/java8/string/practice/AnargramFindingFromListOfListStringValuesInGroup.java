package com.java8.string.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnargramFindingFromListOfListStringValuesInGroup {

	public static void main(String[] args) {

		String[] strArray = { "eat", "ate", "rat", "tea", "nat", "tan" };

		/**
		 * o/p:[[eat, tea, ate], [rat], [tan, nat]]
		 */

		List<String> listStr = Arrays.asList(strArray);

		List<String> listForGroup = new ArrayList<>();
		List<String> listForUniqueStringGroup = new ArrayList<>();

		for (String strVal : listStr) {
			Arrays.sort(strVal.toCharArray());
			String sortedString = new String(strVal);
			
			//creating 

		}

	}

}
