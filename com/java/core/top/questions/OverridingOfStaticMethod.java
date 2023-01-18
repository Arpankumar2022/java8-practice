package com.java.core.top.questions;

public class OverridingOfStaticMethod extends OverridingOfStaticMethodSecond{
	
	
	public static void add() {
		System.out.println("OverridingOfStaticMethod");
	}
	
	// Method overriding can not be considered here
	public static void main(String[] args) {
		//Parent Class Reference will call parent class
		OverridingOfStaticMethodSecond child = new OverridingOfStaticMethod();
		child.add();
	}

}
