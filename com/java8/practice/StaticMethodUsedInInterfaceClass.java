package com.java8.practice;

public class StaticMethodUsedInInterfaceClass implements StaticMethodUsedInInterface{
  

  public static void main(String[] args) {
	  StaticMethodUsedInInterface.staticMethod();
	  staticMethod();
}
  
  
  static void staticMethod() {
	   System.out.println("StaticMethodUsedInInterfaceClass static Method");
  }
}
