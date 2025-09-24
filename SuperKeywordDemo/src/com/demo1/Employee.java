package com.demo1;

public class Employee  extends Person{
    
    
        String name ="meena";
        
         public Employee() {
              super();  // default parent class contructore call...
        }
         
        
         public Employee(int n1) {
              super(n1);  // default parent class contructore call...
        }
        
         
         
         
         
          void show() {
                
              System.out.println("child clas...."+name);  //
              System.out.println("parent class..."+super.name);
          }
          
          void Detail()
           {
                System.out.println("details of EMployee");
           }
        
            void dips() {
                   Detail();   // child 
                   super.Detail();  // parent
                  
            }
          

}
