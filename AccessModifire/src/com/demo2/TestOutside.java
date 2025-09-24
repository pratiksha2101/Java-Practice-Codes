package com.demo2;

import com.demo1.Employee;


public class TestOutside {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
	//	System.out.println(e1.x);  default not accessible outside package
		System.out.println(e1.y);
	//  System.out.println(e1.z);  private not accessible outside the package
	//	System.out.println(e1.a);  protected not accessible outside the package
		

	}

}
