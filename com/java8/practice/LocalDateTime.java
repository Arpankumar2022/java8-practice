package com.java8.practice;

import java.time.Clock;
import java.time.Instant;

public class LocalDateTime {
	
	
	public static void main(String[] args) {
		     Clock clock = Clock.systemDefaultZone();
		  
	        // get Instant Object of Clock
	        // object using instant() method
	        Instant instantObj = clock.instant();
	  
	        // print details of Instant Object
	        System.out.println("Instant for class " + clock
	                           + " is " + instantObj);
	}

}
