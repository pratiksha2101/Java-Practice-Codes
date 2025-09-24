package com.Memberinnerclass;
//memberv inner class 
public class Outer {
	private int num=111;
	
	void show() {
		System.out.println("outside class method...."+num);
		}
	
	        class Inner{
	        	void disp() {
	        		System.out.println("inner class method ..."+num);
	        	}
	        }

}
