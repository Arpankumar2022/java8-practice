package com.java.singleton.top.programmes;

public class SingletonDemo {
	// Step 1: private static variable of INSTANCE variable
	private static volatile SingletonDemo INSTANCE;

	// Step 2: private constructor
	private SingletonDemo() {

	}

	// Step 3: Provide public static getInstance() method
	// returning INSTANCE after checking
	public static SingletonDemo getInstance() {

		// synchronized block
		synchronized (SingletonDemo.class) {
			if (null == INSTANCE) {
				INSTANCE = new SingletonDemo();
			}
			System.out.println(INSTANCE.hashCode());
			return INSTANCE;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(SingletonDemo.getInstance());
	}

}
