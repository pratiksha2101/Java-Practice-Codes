package com.demo9;

import java.nio.file.ClosedWatchServiceException;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        
           HashMap<Integer, Employee> h1= new HashMap<>();
           
           h1.put(1, new Employee(1, "meena", 2000));
           h1.put(2, new Employee(1, "Heena", 2000));
           
           h1.put(3, new Employee(1, "Teena", 2000));
           
             for(Map.Entry<Integer, Employee>   e  : h1.entrySet()) 
             {
                 
                    Employee ee= e.getValue();
                      System.out.println(e.getKey() + "  " + ee.id +ee.name+ee.salary);
                 
             }
           
           

    }

}
