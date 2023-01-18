package com.java.array.based.programmes.part.two;

public class DulpicateNumberFromArray {

	public static void main(String[] args) {

		int[] intArray = new int[] { 1, 5, 5, 4, 6, 4, 9, 8, 10, 10, 3,9,3,1 };

		// FirstWay
		/*
		 * List<Integer> listInt = Arrays.stream(intArray).mapToObj(x -> (Integer)
		 * x).collect(Collectors.toList()); System.out.println(listInt.stream().filter(x
		 * -> Collections.frequency(listInt, x) > 1).distinct()
		 * .collect(Collectors.toList()));
		 */

		// Arrays Way
		int resultArray[] = new int[15];


		for (int i = 0; i < intArray.length; i++) {
			int temp = intArray[i];
			for (int j = i + 1; j < intArray.length; j++) {
				if (temp == intArray[j] && !checkValueIsPresentOrNot(resultArray, temp)) {
					resultArray[i] = temp;
				} else
					continue;
			}
		}
		
		for (int i = 0; i < resultArray.length; i++) {
			System.out.println(" "+resultArray[i]+" ");
		}

	}

	private static boolean checkValueIsPresentOrNot(int[] resultArray, int i) {
		for (int j = 0; j < resultArray.length; j++) {
			if (i == resultArray[j])
				return true;
		}
		return false;
	}

}
