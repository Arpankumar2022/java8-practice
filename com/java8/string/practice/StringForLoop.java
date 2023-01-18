package com.java8.string.practice;

public class StringForLoop {
	
	public static void main(String[] args) {
		String s ="ARPAN";
		
		
		try {
		for (int i=0; i>10; i++) {
			 s=s+"hello";   
		}
		
		
		
		int i = 10/0;
		
		String str = null;
		str.toCharArray();
		
		}catch(ArithmeticException  | NumberFormatException  | NullPointerException ne) {
			ne.printStackTrace();
			}
		System.out.println(s);
	}

}
