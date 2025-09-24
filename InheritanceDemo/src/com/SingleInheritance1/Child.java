package com.SingleInheritance1;

public class Child extends Parent{
	
	void disp() {
		System.out.println("child class...."+name);
		name="meena";
		System.out.println("child class...."+name);
	}

}
