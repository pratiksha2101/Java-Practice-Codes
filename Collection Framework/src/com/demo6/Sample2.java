package com.demo6;

import java.util.LinkedHashSet;

public class Sample2 {

    public static void main(String[] args) {
        
        LinkedHashSet<String> s= new LinkedHashSet<>();
        
           s.add("aaa");
             s.add("ppp");

             s.add("aaa");
             s.add("ghf");
             s.add("cbdg");
             s.add(null);
             
             
             System.out.println(s);
        
    }

}
