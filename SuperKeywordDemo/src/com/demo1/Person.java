package com.demo1;

public class Person {
    
     String name="heena";
     int num;
     
         public Person() {
            
               System.out.println("parent class contructore call...");
        }
     
         
         public Person(int num) {
                 this.num=num;
               System.out.println("parent class parametrised contructore call.."+num);
        }
     
     
       void Detail()
       {
            System.out.println("details of person");
       }
}