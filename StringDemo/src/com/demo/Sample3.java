package com.demo;

public class Sample3 {

	public static void main(String[] args) {
		
		String s1= "seven mentor";
		System.out.println("length of string "+ s1.length());
		
		//charAt(int index)
		
		System.out.println("length of string "+s1.charAt(2));
		
		//indexOf(char)
		
		System.out.print("index of char " +s1.indexOf('e'));
		
		//indexOf(char int)
		
		System.out.print("index of char " +s1.indexOf('e',2));
		
		System.out.print("index of char " +s1.indexOf('e',4));
		
		System.out.print("index of char " +s1.indexOf('q'));
		
		//lowercase uppercase
		
		String ss="ABCDEF";
		
		System.out.println("lowercase "+ss.toLowerCase());
		
		System.out.println("uppercase "+ss.toUpperCase());
		
		

	}

}
