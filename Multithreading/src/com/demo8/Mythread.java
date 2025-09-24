package com.demo8;

import java.util.Iterator;

public class Mythread  implements Runnable {
    SnapChat s1;
    
     String[] s2= {"hey" ,"how r you ?" ,"I m fine" };
    
    
     Mythread(SnapChat s1){
         
         this.s1=s1;
         new Thread(this,"sender").start();
     }
     
 
    @Override
    public void run() {
        
          for(int i=0 ; i<s2.length ;i++)
          {
                 s1.sender(s2[i]);   
          }
         
    }
    
       

}