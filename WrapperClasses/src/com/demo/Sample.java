package com.demo;

public class Sample {

	public static void main(String[] args) {
		int num =11;
		System.out.println(num);  // 11
		
		Integer i = Integer.valueOf(num);
		
		System.out.println(i);
		
		//primitive covert into Object
		Integer j= num;  // autoboxing
		
		System.out.println(j);

	}

}
