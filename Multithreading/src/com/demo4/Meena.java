package com.demo4;

public class Meena {
    
              public void send(String mssg) 
              {
                        System.out.println("Meena :" + mssg);   
                           
                        try {
                            Thread.sleep(900);
                        } catch (InterruptedException e) {
                           System.out.println("Thread Interpert");
                        }
                        
                        System.out.println(" \n " +mssg +" sent");
              }

}

