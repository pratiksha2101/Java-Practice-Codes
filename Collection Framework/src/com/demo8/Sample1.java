package com.demo8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sample1 {

    public static void main(String[] args) {
        
         HashMap<Integer, String> h1= new HashMap<>();
         
            h1.put(1, "mmmm");
            h1.put(2, "pppp");
            h1.put(3, "sss");
            
            h1.put(22, "pppp");
            
            h1.put(null,"lll");
            h1.put(5,null);
            h1.put(33, null);
            
            System.out.println(h1);
            
            
//            Set s1= h1.entrySet();
//            
//               System.out.println(s1);
                
               
                  for(Map.Entry  e1  :  h1.entrySet())
                  {
                          System.out.println(e1.getKey() +" "+e1.getValue());  
                  }
            
                  HashMap<Integer, String> h2= new HashMap<>();
                  
                    h2.put(11, "mmmm");
                    h2.put(233, "pppp");
                    h2.put(356, "sss");
                    
                    h2.putAll(h1);
                    
                    System.out.println(h2);
                    h2.putIfAbsent(11, "new");
                    System.out.println(h2);
                    
                    
                    
                    h2.remove(233);
                    System.out.println(h2);
                    
                    
                    
                    h2.replace(356, "sss","seven");
                    
                    System.out.println(h2);

    }

}