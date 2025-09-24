package com.demo3;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEMp {

    public static void main(String[] args) {
        
        
        Employee e= new Employee(1, "meena",20000.8f);
        
            ArrayList<Employee> a1 = new ArrayList<>();
            
            a1.add(e);
            a1.add(new Employee(2, "teena",400.8f));
            
            a1.add(new Employee(3, "reena",400.8f));
            a1.add(new Employee(4, "meena",400.8f));
            
            
//            System.out.println(a1);
            
            //itration
             
             Iterator<Employee> i = a1.iterator();
             
             while(i.hasNext())
             {
                    Employee ee= i.next();
                    System.out.println(ee.id +" "+ee.name+" "+ee.salary);
             }
            
            
        

    }

}