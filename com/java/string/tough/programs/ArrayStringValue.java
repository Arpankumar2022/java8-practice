package com.java.string.tough.programs;

public class ArrayStringValue {

	public static void main(String[] args) {

		int[] firstArray = { 1, 2, 3 };

		char[] secondArray = { 'A', 'B', 'C' };

		for (int i = 0; i < firstArray.length; i++) {

			StringBuilder s = new StringBuilder(" ");

			s = s.append(firstArray[i]);

			for (int j = 0; j < secondArray.length; j++) {

				s = s.append(secondArray[j]);

				System.out.println(s);
			}

		}
	}
}
