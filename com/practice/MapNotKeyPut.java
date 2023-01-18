package com.practice;

import java.util.HashMap;
import java.util.Map;

public class MapNotKeyPut {
	
	public static void main(String[] args) {
		
		
		 Map< String, Integer> map = new HashMap<>();
		 
		 String str = "abc";
		 String str2 = new String("abc");
		 
		 map.put(str, 1);
		 map.put(str2, 2);
		 
		 
		 String str3 = new String("abc");
		 
		 System.out.println(str3);
		 
		 System.out.println(map.get(str3));
	}

}
