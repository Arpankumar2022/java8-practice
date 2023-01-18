package com.java.core.top.questions;

public class OverloadingStaticMethodJava {
	
	
	//public static abstract void addNew();
	
	
	public static void add() {
		System.out.println("static void add");
	}
	
	public static void add(int a, int b) {
		System.out.println("static void add" +(a+b));
	}
	
	
	public static void main(String[] args) {
		OverloadingStaticMethodJava.add(4, 5);
		
	}

}
