package com.java.array.based.programmes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIArrayBasedSum {

	public static void main(String[] args) {

		int[] firstArray = { 2, 3, 4, 6, 1, 7, 8 };
		int[] secondArray = { 12, 13, 14, 16, 11, 17, 18 };

		List<Integer> listFirst = Arrays.stream(firstArray).mapToObj(x -> (Integer) x).collect(Collectors.toList());
		List<Integer> listSecond = Arrays.stream(secondArray).mapToObj(x -> (Integer) x).collect(Collectors.toList());

		List<Integer> finalList = new ArrayList<>();

		Integer lengthSecond = listSecond.size();

		for (Integer intVal : listFirst) {
			lengthSecond = lengthSecond - 1;
			finalList.add(Integer.sum(intVal.intValue(), listSecond.get(lengthSecond).intValue()));
		}

		System.out.println(finalList);
	}

}
