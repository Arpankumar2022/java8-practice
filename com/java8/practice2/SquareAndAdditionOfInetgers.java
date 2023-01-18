package com.java8.practice2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquareAndAdditionOfInetgers {
	
	public static void main(String[] args) {
		List<Integer> listInteger = Stream.of(2, 45, 24, 19, 39, 27, 7, 11, 17, 28).collect(Collectors.toList());
		
		listInteger.stream().map(x->x*x).filter(y-> y>100).collect(Collectors.toList()).forEach(System.out::println);

	}

}
