package com.demo;

public class Sample1 {

    public static void main(String[] args) {
        
            try {
                
                 int num=20/0;
                   
                   System.out.println(num);  //
                   
            } catch (ArithmeticException e) {
                  System.out.println(e);
            }
           
           
           System.out.println("execution here...");
           
    }

}