package com.java.array.based.programmes.part.two;

public class FindingMissingElementFromArray {
	
	public static void main(String[] args) {
		
		int[] intArray = new int[]{1, 2, 3, 4, 6, 7, 9, 8, 10};
		
		int totalSum = 10*(10+1)/2;
		
		int sumOfNumbers=0;
		
		for (int i = 0; i < intArray.length; i++) {
			sumOfNumbers = sumOfNumbers+intArray[i];
		}
	int resultMissingNumber =  totalSum - sumOfNumbers;
	System.out.println(resultMissingNumber);
	}

}
