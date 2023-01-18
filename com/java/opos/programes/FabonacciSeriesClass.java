package com.java.opos.programes;

public class FabonacciSeriesClass {
	
	public static void main(String[] args) {
		
		// o/u --> 0,1,1,2,3,5,8,12,20,32,52
		
		int j = 1;
		int k = 0;
		
		int val = Integer.parseInt(args[0]);
		
		System.out.println(k);
		System.out.println(j);
		
		for(int i=0 ; i< val ; i++) {     // o(n)  //o(1)
			j=k+j;
			k=j;
			// k=k+j;
			
			System.out.println(k);
			
		}
		
		
	}	
		
	

}
