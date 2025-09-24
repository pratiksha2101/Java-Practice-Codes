package com.demo1;

public class Test {

	public static void main(String[] args) {
		
		
		try {
			throw new Myexception("THis is my exception...");
			
			
		}catch (Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}

	}

}
