package com.demo;

public class Sample1 {

	public static void main(String[] args) {
		
		Integer x= new Integer(22);
		
		System.out.println(x);
		
		int y =x.intValue();
		
		System.out.println(y);
		
		// object convert into primitive
		
		int z=x;   //unboxing
		
		System.out.println(z);
		

	}

}
