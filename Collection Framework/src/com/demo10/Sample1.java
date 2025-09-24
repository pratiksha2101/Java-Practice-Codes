package com.demo10;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class Sample1 {
    
       

    public static void main(String[] args) {
    
        
//             Set<Days>  e= EnumSet.of(Days.friday,Days.saturday);
        
          Set<Days>  e= EnumSet.allOf(Days.class);
             
              System.out.println(e);
              
              Iterator<Days> i = e.iterator();
              
                while(i.hasNext())
                {
                      System.out.println(i.next());
                }
    }

}