package com.demo7;

public class MyThreadClassDemo {
	public static void main(String[]args)
	{
		final String res1="seven";
		final String res2="mentor";
		
		//thread 1
		//t1 tries to lock res1 and res2
		Thread t1=new Thread() {
			
			public void run() {
				synchronized(res1) {
					System.out.println("t1 lock resource 1");
					
				try{
					Thread.sleep(1000);
					
				}catch(InterruptedException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized (res2) {
					System.out.println("t1 lock resource 2");
					
					
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						//TODO Auto-generated catch block
						e.printStackTrace();
						
					}
				}
				}
			}
		};
		
		//t2 tries to lock res2 then res1
		Thread t2=new Thread() {
			public void run() {
				synchronized(res2) {
					System.out.println("t1 lock resource 2");
					
				try{
					Thread.sleep(1000);
					
				}catch(InterruptedException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized (res1) {
					System.out.println("t2 lock resource 1");
					
					
					try {
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						//TODO Auto-generated catch block
						e.printStackTrace();
						
					}
		}
			
	
			}
		}
		         
		
			};

	}
}
