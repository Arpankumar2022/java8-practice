package com.java8.practice;

import java.util.Optional;

public class OptionalNull {
public static void main(String[] args) {
	Object obj = "";
	System.out.println(Optional.of(obj).orElse(obj));
 }
}
