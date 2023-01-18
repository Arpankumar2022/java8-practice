package com.practice;

public class RecursionDemo {

	public static void main(String[] args) {
		System.out.println(factorialOfFive(5));
	}

	public static int factorialOfFive(int val) {
	   int result=val;
		while(val>0) {
			result = result*factorialOfFive(val-1);
		}
		return result;
	}

}
