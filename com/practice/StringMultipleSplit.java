package com.practice;

import java.util.Arrays;
import java.util.List;

public class StringMultipleSplit {
	
	public static void main(String[] args) {
		String str = "kmkkm \\  ARPAN  !KUMARSRI   .NEWHERO  ?NUMBER:  NSNSN;  SJS";
		
		 String[] splittedString = str.split("[\\!.?:;]");
		
		List<String>  list = Arrays.asList(splittedString);
		
		list.stream().forEach(System.out::print);
	}

}
