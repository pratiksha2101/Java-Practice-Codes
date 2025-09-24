package com.demo4;

// a sender class for  sending massage  using thread
public class Heena extends Thread{
    
         private String mssg;
         
         Meena m1;
         
         
         //reciver  method  to receive  a message  object   and  a message to be sent
         
           public Heena(String mssg,Meena m1) {
                   this.mssg=mssg;
                   this.m1=m1;
        }
           
           @Override
        public void run() {
                        synchronized (m1) 
                        {
                              m1.send(mssg);
                        }
        }
    
          

}
