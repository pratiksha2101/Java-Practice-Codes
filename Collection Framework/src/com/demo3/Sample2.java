package com.demo3;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Sample2 {

    public static void main(String[] args) {
    
        
        LinkedList<String> l1= new LinkedList<>();
          l1.add("sss");
          l1.add("gggg");
          l1.add("aaaa");
          l1.add("sss");
          l1.add("sss");
          l1.add("xxxx");
          
          System.out.println(l1);
          
          l1.addFirst("first");
          l1.addLast("last");
          
          System.out.println(l1);
          
        System.out.println(  l1.contains("sss"));
        
        Collections.sort(l1);
        System.out.println("after sort "+ l1);
        
        System.out.println("get:- "+ l1.get(2));
        
        System.out.println("getfirst:-  "+ l1.getFirst());
        System.out.println("getlast:-  "+ l1.getLast());
        
        System.out.println("index of : "+ l1.indexOf("sss"));
        
        System.out.println("last index of : "+ l1.lastIndexOf("sss"));
        
        
        
        Iterator< String> i= l1.descendingIterator();
         
        while(i.hasNext()) 
        {
           System.out.println(i.next());    
        }
        
        
        
        l1.remove(12);
        
        System.out.println("after remove:- "+  l1);
        
        
        
        

    }
}
