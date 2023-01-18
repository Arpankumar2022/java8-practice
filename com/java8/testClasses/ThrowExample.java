package com.java8.testClasses;

public class ThrowExample {

	public static void main(String[] args) {
		try {
			throw new NumberFormatException();
		} catch (NumberFormatException e) {
			
			
			
			System.out.println("NumberFormatException");
			
			
			///try {
			throw new NumberFormatException();
			//}catch (Exception ex) {
					
					
					
				//	System.out.println("NumberFormatExceptionMiddle");
			// }
		}catch (Exception e) {
			
			
			
			System.out.println("NumberFormatExceptionSecond");
			throw new NumberFormatException();
		}
	}

}
