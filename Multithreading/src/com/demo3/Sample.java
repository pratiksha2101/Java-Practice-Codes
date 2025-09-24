package com.demo3;

public class Sample {

	void show(int num)
	{
		synchronized (this)
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

}
