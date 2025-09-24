package com.demo6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sample1 {

    public static void main(String[] args) {
        
        
         Set<String> s= new HashSet<>();
         
             s.add("aaa");
             s.add("ppp");

             s.add("aaa");
             s.add("ghf");
             s.add("cbdg");
             
             System.out.println(s);
             
             
             Iterator<String> i= s.iterator();
             
             while(i.hasNext())
             {
                  System.out.println(i.next());
             }
             
           
             ArrayList<String>  a1= new ArrayList<>();
             
             a1.add("dls");
             a1.add("pps");
             
             System.out.println(a1);
             s.addAll(a1);
             
             System.out.println(s);
             
             
             
    }

}