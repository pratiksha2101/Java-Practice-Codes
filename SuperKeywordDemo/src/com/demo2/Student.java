package com.demo2;

public class Student extends College {
    
    String stu_name;
    int roll;
     
    public Student() {
        super();   // by default call parent class constructore..
        System.out.println("student class constrcutoe..");
        
    }
    
    
    Student(String stu_name ,int roll ,String collgname)
    {
          super(collgname);
          
           this.stu_name=stu_name;
           this.roll=roll;
    }
    
      void disp() {
          
            System.out.println(stu_name+"  "+roll+" "+name);
      }

}