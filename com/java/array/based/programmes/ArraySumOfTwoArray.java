package com.java.array.based.programmes;

public class ArraySumOfTwoArray {

	public static void main(String[] args) {
		int[] firstArray = { 2, 3, 4, 6, 1, 7, 8 };
		int[] secondArray = { 12, 13, 14, 16, 11, 17, 18 };
		int[] finalArray = new int[10];
		int j = secondArray.length;
		for (int i = 0; i < firstArray.length; i++) {
			j =  j-1;
			finalArray[i] = firstArray[i] + secondArray[j];
		}
		for (int k = 0; k < finalArray.length; k++)
			System.out.println(finalArray[k]);

	}

}