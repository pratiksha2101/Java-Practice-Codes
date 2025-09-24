package com.demo;

import java.util.Scanner;

public class TestEmp {

    public static void main(String[] args) {
        
          Scanner s1 = new Scanner(System.in);
          System.out.println("enter the id");
          int id= s1.nextInt();
          
          System.out.println("enter the name");
          String name = s1.next();
          
          System.out.println("enter salary");
          float salary = s1.nextFloat();
          
           Employee e= new Employee(id,name,salary);
        
           e.show();

    }

}
