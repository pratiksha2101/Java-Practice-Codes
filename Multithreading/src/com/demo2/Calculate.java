package com.demo2;

public class Calculate {
	
	synchronized void show(int num)
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName() +" "+(i+num));
			
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			}
	}

}
