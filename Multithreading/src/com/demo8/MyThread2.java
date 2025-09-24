package com.demo8;

public class MyThread2 implements Runnable {
    SnapChat s1;
    
     String[] s2= {"hii" ,"i m good" ,"I m fine" };
    
    
     MyThread2(SnapChat s1){
         
         this.s1=s1;
         new Thread(this,"Reciver").start();
     }
     

    @Override
    public void run() {
        
          for(int i=0 ; i<s2.length ;i++)
          {
                 s1.Reciver(s2[i]);   
          }
         
    }
    
       

}


