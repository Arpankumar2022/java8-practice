package com.java8.practice;

import java.util.Comparator;

public class LambdaWithFunctionalInterface {
	public static void main(String[] args) {
		//Functional Interface with Lambda  Integration
		Comparator<String> s = (String a, String b) -> "abc".compareTo("def");
		//System.out.println(s.);
	}
}
