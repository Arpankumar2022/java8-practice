package com.java8.practice;

public class DefaultMethodInteraceUseImplementedClass implements DefaultMethodInteraceUse{

	@Override
	public void displayName() {
     System.out.println("displayName");		
	}

	@Override
	public void displayName2() {
		 System.out.println("displayName1");			
	}

	@Override
	public void displayName3() {
		 System.out.println("displayName3");	
	}
	
	/*@Override
	public void methodDefault() {
		System.out.println("methodDefault in DefaultMethodInteraceUseImplementedClass");
	}*/
	
	public static void main(String[] args) {
		DefaultMethodInteraceUseImplementedClass obj = new DefaultMethodInteraceUseImplementedClass();
		obj.methodDefault();
	}


}
