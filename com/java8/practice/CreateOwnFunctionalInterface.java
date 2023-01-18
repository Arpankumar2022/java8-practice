package com.java8.practice;


@FunctionalInterface
public interface CreateOwnFunctionalInterface{
	
  public void singelAbstarctMethod();
  
 // public void singelAbstarctMethod1();
  
  
  default void printName() {
	  System.out.println("This is defualt method one");
  }
  
   public  static void printNameStatic() {
	  System.out.println("This is defualt method one");
  }
   
   public  static void printNameStatic2() {
		  System.out.println("This is defualt method one");
	  }
}
