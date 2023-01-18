package com.java.array.based.programmes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateValuesInArray {

	public static void main(String[] args) {

		int[] inputArray = { 111, 333, 555, 777, 333, 444, 555, 111 };

		List<Integer>  listInteger =  Arrays.stream(inputArray).mapToObj(x -> (Integer) x).collect(Collectors.toList());
		
		System.out.println(listInteger.stream().filter(x-> Collections.frequency(listInteger, x)>1).distinct().collect(Collectors.toList()));

	}

}
