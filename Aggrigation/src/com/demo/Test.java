package com.demo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		DOJ d=new DOJ(11, 2024, "Jan");
		Address employeeAddress=new Address("Satara",415002);
		
		Scanner s1=new Scanner(System.in) ;
		System.out.println("enter the id");
		int i=s1.nextInt();
		System.out.println("enter the name");
		String n1=s1.next();

		
		
		Employee e1=new Employee (i,n1,d,employeeAddress);
		e1.display();
			
		
		

	}

}
