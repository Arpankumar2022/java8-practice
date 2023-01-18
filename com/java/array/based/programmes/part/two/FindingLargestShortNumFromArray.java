package com.java.array.based.programmes.part.two;

public class FindingLargestShortNumFromArray {

	public static void main(String[] args) {

		int[] intArray = new int[] { 1, 5, 14, 6, 9, 8, 10 };

		// First Way
		/*
		 * List<Integer> listInt = Arrays.stream(intArray).mapToObj(x -> (Integer)
		 * x).collect(Collectors.toList()); Integer max = listInt.stream().mapToInt(v ->
		 * v).max().orElseThrow(NoSuchElementException::new); System.out.println(max);
		 * Integer min = listInt.stream().mapToInt(x-> x).min().getAsInt();
		 * System.out.println(min);
		 */

		// Second Way
		/*Integer maxValue = Arrays.stream(intArray).max().getAsInt();
		Integer minValue = Arrays.stream(intArray).min().getAsInt();
		System.out.println("maxValue  " + maxValue + "    minValue " + minValue);*/

		// Third Way

		int maxValueFromArray = 0;
		for (int i = 0; i < intArray.length; i++) {
			int temp = intArray[i];
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[j] > temp ) {
					maxValueFromArray = intArray[j];
				} else {
					continue;
				}

			}
		}
		
		System.out.println(maxValueFromArray);

	}

}
