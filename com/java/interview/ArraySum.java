package com.java.interview;

import java.util.Objects;

public class ArraySum {
	public static void main(String[] args) {

		int[] intArray = { 0, -1, 2, -3, 1 };
		int[] intArray2 = { 0, -1, 2, 4, 1 };

		findSumValues(intArray);
		findSumValues(intArray2);

	}

	private static void findSumValues(int[] intArray) {
		int targetSum = -2;
		
		Boolean resultOfInvalidArray = Boolean.FALSE;

		for (int i = 0; i < intArray.length; i++) {

			int temp = intArray[i];

			for (int j = i + 1; j < intArray.length; j++) {

				if (Objects.equals((temp + intArray[j]), targetSum)) {
					resultOfInvalidArray = Boolean.TRUE;
					System.out.println("values are" + temp + "  " + intArray[j]);

				} else
					continue;

			}

		}
		
		if(!resultOfInvalidArray)
			System.out.println("No valid pair exists");

	}

}
