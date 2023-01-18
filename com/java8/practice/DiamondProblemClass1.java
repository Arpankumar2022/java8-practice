package com.java8.practice;

public class DiamondProblemClass1 implements DiamondProblemInterface, DiamondProblemInterfaceOther{

	@Override
	public void methodDefault() {
		DiamondProblemInterfaceOther.super.methodDefault();
	}
  public static void main(String[] args) {
	  DiamondProblemClass1 obj = new DiamondProblemClass1();
	  obj.methodDefault();
}
}
