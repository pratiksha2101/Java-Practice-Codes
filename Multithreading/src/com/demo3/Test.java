package com.demo3;

public class Test {

	public static void main(String[] args) {
		
		Sample s=new Sample();
		ThreadOne t1= new ThreadOne(s);
		ThreadTwo t2= new ThreadTwo(s);
		
		t1.start();
		t2.start();
		

	}

}
