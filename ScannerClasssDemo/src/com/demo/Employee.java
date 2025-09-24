package com.demo;

public class Employee {
    
        int id;
        String name;
        float Salary;
        
        public Employee(int id, String name, float salary) {
            
            this.id = id;
            this.name = name;
            this.Salary = salary;
        }
        
         void show()
         {
              System.out.println(id+" "+name+" "+Salary);
         }
        
        
          

}

 
