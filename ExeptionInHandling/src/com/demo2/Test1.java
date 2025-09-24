package com.demo2;

public class Test1 {
    
    
     static  void checkAge(int age) {
                     
                       if(age < 18)
                       {
                             try {
                                 throw new InvalidAgeException("age is not valid...");
                            } catch (InvalidAgeException e) {
                                   System.out.println(e);
                            }
                       }else
                       {
                            System.out.println("valid age...");
                       }
             }
    

    public static void main(String[] args) {

                     Test1.checkAge(10);
                     System.out.println("rest of the code..");

    }

}


