package com.tough.interview.practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNumberFromListInteger {

	public static void main(String[] args) {

		List<Integer> listInteger = Stream.of(22, 45, 24, 19, 39, 27, 7, 11, 17, 28).collect(Collectors.toList());

		System.out.println(listInteger.stream().filter(a -> a%2 == 0).collect(Collectors.toList()));

	}

}
