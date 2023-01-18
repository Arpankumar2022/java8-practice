package com.java.array.based.programmes;

import java.util.Arrays;

public class CheckingEqualitySumOfArrayGroup {

	public static void main(String[] args) {
		
		int[] firstArrayInt = { 4, 6, 5, -10, 8, 5, 20 };

		int[] secondArrayInt = { 4, -5, 9, 11, 25, 13, 12, 8 };

		int[] thirdArrayInt = { 12, 13, 10, 15, 8, 40, -15 };

		int[] fourthArrayInt = { 12, 23, 10, 41, 15, 38, 27 };
		
		int firstSumArray =  Arrays.stream(firstArrayInt).sum();
		int secondSumArray =  Arrays.stream(secondArrayInt).sum();
		int thirdSumArray =  Arrays.stream(thirdArrayInt).sum();
		int fourthSumArray =  Arrays.stream(fourthArrayInt).sum();
		
		
		System.out.println("firstSumArray" +firstSumArray);
		System.out.println("secondSumArray" +secondSumArray);
		System.out.println("thirdSumArray" +thirdSumArray);
		System.out.println("fourthSumArray" +fourthSumArray);
		
		
		

	}

}
