package com.demo8;

public class SnapChat {
    
        boolean flag =false;
        
           
        public  synchronized void sender(String mssg) {
            
                          if(flag) {
                                try {
                                    wait();
                                } catch (InterruptedException e) {
                                    // TODO Auto-generated catch block
                                    e.printStackTrace();
                                }                              
                          }
                          System.out.println(" sender : "+mssg);
                          flag =true;
                          notify();
        }
        
        
        public synchronized void Reciver(String mssg)
        {
               if(!flag) {
                     try {
                        wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
               }
               System.out.println( " reciver : "+mssg);
                  flag =false;
                  notify();
        }


		
        
        

}