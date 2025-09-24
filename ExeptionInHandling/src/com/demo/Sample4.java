package com.demo;

public class Sample4 {

    public static void main(String[] args) {
        
        
         try {
              String s1 =null;
              
                 System.out.println(s1.length());
                 
        } catch (ArithmeticException e) {
               System.out.println(e);
        }finally {
             System.out.println("somthing imporatant ");
        }
            

    }

}