package com.java.array.based.programmes;

public class FindContinuousSubArrayWhoseSumEqualToGivenNumber {
	public static void main(String[] args) {

		int[] firstArrayInt = { 42, 15, 12, 8, 6, 32 };

		int[] secondArrayInt = { 12, 5, 31, 13, 21, 8 };

		int[] thirdArrayInt = { 15, 51, 7, 81, 5, 11, 25 };

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

			int a = firstArrayInt[i];

			for (int j = i + 1; j < firstArrayInt.length; j++) {
				if (a + firstArrayInt[j] == inputNum) {

					System.out
							.println("values of pair" + ": " + a + " ," + firstArrayInt[j] + "inputnumber " + inputNum);

				} else
					continue;
			}
		}

	}

}
