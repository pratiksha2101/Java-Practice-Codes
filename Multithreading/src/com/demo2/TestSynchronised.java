package com.demo2;

public class TestSynchronised {

	public static void main(String[] args) {
	
		
	final Calculate obj=new Calculate();
	Thread t1 =new Thread()
	{
		@Override
		public void run() {
			obj.show(3);
		}
		
		
	};
	
	Thread t2=new Thread() {
		@Override
		public void run() {
			obj.show(2);
		}
	};
	
	t1.start();
	t2.start();

	}

}
