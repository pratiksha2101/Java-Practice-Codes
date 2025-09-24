package com.demo;

public interface Bank {
	int x=11;    //static final x=11
	
	void show();    //abstract void show()
	
	
	//can create constructor of interface
	//we cannot able to implement non abstract method interface
	
	
	default void disp() {
		System.out.println(" default method can implement inside the interface");
	}
	static void fun() {
		System.out.println("static method can implement");
	}
	
	//final method cannot be implement inside the interface

}
