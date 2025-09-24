package com.demo;

public class Example1 {

	public static void main(String[] args) {
		
		int length=0;
		
		String s = "meena";
		for(char c1: s.toCharArray())
			length++;
		System.out.println("length of string is : "+length);

	}

}
