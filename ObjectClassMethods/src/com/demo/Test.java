package com.demo;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		employee e1=new employee(1,"meena");
		
		employee e2=(employee)e1.clone();
		
		System.out.println(e1);
		System.out.println(e2);
		

	}

}
