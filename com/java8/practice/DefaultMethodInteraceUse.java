package com.java8.practice;

public interface DefaultMethodInteraceUse {
	
	public void displayName();
	
	public void displayName2();
	
	public void displayName3();
	
	default void methodDefault() {
		System.out.println("methodDefault");
	}
	
	// void displayName4();

}
