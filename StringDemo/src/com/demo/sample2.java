package com.demo;

public class sample2 {

	public static void main(String[] args) {
		// mutable string
		
		StringBuffer s1=new StringBuffer("meena");
		System.out.println("before concatination "+s1);
		
		s1.append("ROY");
		
		System.out.println("After concatination "+ s1);
		System.out.println(s1.reverse());

	}

}
