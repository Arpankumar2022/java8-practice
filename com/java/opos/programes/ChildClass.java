package com.java.opos.programes;

public class ChildClass extends ParentClass {

	public static void display() {
		System.out.println("Child Class method");
	}

	public static void main(String[] args) {

		//ParentClass p1 = new ChildClass();
		ParentClass.display();
		ChildClass.display();

	}

}
