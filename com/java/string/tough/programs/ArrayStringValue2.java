package com.java.string.tough.programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayStringValue2 {
	public static void main(String[] args) {

		int[] firstArray = { 1, 2, 3 };

		char[] secondArray = { 'A', 'B', 'C' };

		Arrays.stream(firstArray).mapToObj(x -> (Integer) x).collect(Collectors.toList()).stream().forEach((val) -> {
			StringBuilder str = new StringBuilder(" ");
			str = str.append(val);
			for (int j = 0; j < secondArray.length; j++) {
				str = str.append(secondArray[j]);
				System.out.println(str);
			}
		});

		
	}

}
