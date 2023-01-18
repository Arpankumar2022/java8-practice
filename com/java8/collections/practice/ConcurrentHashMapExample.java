package com.java8.collections.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConcurrentHashMapExample {
	 public static void main(String[] args)
	    {
	       /* ConcurrentHashMap<String,String> premiumPhone = new ConcurrentHashMap<String,String>();
	        premiumPhone.put("Apple", "iPhone6");
	        premiumPhone.put("HTC", "HTC one");
	        premiumPhone.put("Samsung","S6");
	        
	        Iterator iterator = premiumPhone.keySet().iterator();
	        
	        while (iterator.hasNext())
	        {
	            System.out.println(premiumPhone.get(iterator.next()));
	            premiumPhone.put("Sony", "Xperia Z");
	        }*/
		 Map<String,String> premiumPhone = new HashMap<String,String>();
	        premiumPhone.put("Apple", "iPhone6");
	        premiumPhone.put("HTC", "HTC one");
	        premiumPhone.put("Samsung","S6");
	        
	        Iterator iterator = premiumPhone.keySet().iterator();
	        
	        while (iterator.hasNext())
	        {
	            System.out.println(premiumPhone.get(iterator.next()));
	            premiumPhone.put("Sony", "Xperia Z");
	        }
	    }
}
