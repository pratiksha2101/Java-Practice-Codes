package com.demo2;

public class MyThread2 extends Thread{
	
	Calculate c1;
	
	MyThread2(Calculate c1)
	{
		this.c1=c1;
	}
	
	@Override
	public void run() {
		c1.show(3);
	}

}
