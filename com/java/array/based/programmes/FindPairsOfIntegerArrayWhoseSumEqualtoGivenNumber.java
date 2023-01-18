package com.java.array.based.programmes;

public class FindPairsOfIntegerArrayWhoseSumEqualtoGivenNumber {
	
	
	public static void main(String[] args) {
		
		int[] firstArrayInt = { 4, 6, 5, -10, 8, 5, 20 };

		int[] secondArrayInt = { 4, -5, 9, 11, 25, 13, 12, 8 };

		int[] thirdArrayInt = { 12, 13, 10, 15, 8, 40, -15 };

		int[] fourthArrayInt = { 12, 23, 10, 41, 15, 38, 27 };
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		sumOfPairsEqualityCheck(firstArrayInt, 10);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		sumOfPairsEqualityCheck(secondArrayInt, 20);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		sumOfPairsEqualityCheck(thirdArrayInt, 25);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		sumOfPairsEqualityCheck(fourthArrayInt, 50);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		
		
	}

	private static void sumOfPairsEqualityCheck(int[] firstArrayInt, int inputNum) {
		
	
		
		for (int i = 0; i < firstArrayInt.length; i++) {
			
			int a= firstArrayInt[i];
			
			for(int j= i+1 ; j<firstArrayInt.length; j++) {
				if(a+firstArrayInt[j]==inputNum) {
				
					System.out.println("values of pair" +": "+a +" ,"+firstArrayInt[j]+"inputnumber " +inputNum);
					
				}else
					continue;
			}
		}
		
		
	}

}
