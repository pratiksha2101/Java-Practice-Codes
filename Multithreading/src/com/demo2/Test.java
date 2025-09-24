package com.demo2;

public class Test {

	public static void main(String[] args) {
		
		
		Calculate c= new Calculate();
		
		MyThread m=new MyThread(c);
		m.start();
		System.out.println("**********************");
		MyThread2 m1=new MyThread2(c);
		m1.start();

	}

}
