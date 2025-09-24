package com.demo7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

public class SAmple1 {

    public static void main(String[] args) {
        
          PriorityQueue<String> p= new PriorityQueue<>();
          
            p.add("aa");
            p.add("bb");
            p.add("cc");
            p.add("dd");
//           p.add(null);
            
            
            System.out.println(p);
            
            Iterator<String> i= p.iterator();
              while(i.hasNext()) 
              {
                  System.out.println(i.next());  
              }
            
         Deque< String> s= new ArrayDeque<>();
             s.add("sss");
             s.add("ppp");
             s.add("ooo");
             
               System.out.println(s);
              
              

    }

}
