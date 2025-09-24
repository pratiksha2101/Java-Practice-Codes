package com.demo9;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SAmple2 {

    public static void main(String[] args) {
        
         TreeMap<Integer, String> t1= new TreeMap<>();
         
           t1.put(22, "dd");
           t1.put(17, "pp");
           t1.put(18, "pp");
           t1.put(57, "pp");
           t1.put(23, "llll");
           t1.put(1, "ghjj");
           
           System.out.println(t1);
           
            Set s= t1.entrySet();
            
            System.out.println(t1.descendingKeySet());
           System.out.println( t1.descendingMap());
                
                 Iterator i = s.iterator();
                 
                    while(i.hasNext())
                    {
                                Map.Entry e = (Entry) i.next();    
                                System.out.println(e.getKey()  +"  "+e.getValue());
                    }
                    

                   
                    
                    System.out.println(t1.headMap(17, true));
                    
                    System.out.println(t1.tailMap(17, true));
                    
                    System.out.println(t1.subMap(17,23));
                    
                    
System.out.println(t1.higherKey(17));
System.out.println(t1.lowerKey(17));
                  System.out.println(t1.lastKey());
                  System.out.println(t1.lastEntry());
                  
                 System.out.println(t1.pollFirstEntry());
                 System.out.println(t1);
                 
                 
                 
                 NavigableMap<Integer, String>  n= new TreeMap<>();
                 SortedMap<Integer, String> n2= new TreeMap<>();
                 
                 n2.put(34, "some");
                 n2.putAll(t1);
                 System.out.println("New map");
                  System.out.println(n2);
                 
                    
    }

}