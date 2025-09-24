package com.demo6;

import java.util.TreeSet;

public class Sample4 {

    public static void main(String[] args) {
        TreeSet<Integer> t1= new TreeSet<>();
        
        t1.add(11);
        t1.add(2);
        t1.add(222);
        t1.add(9);
        
        
          
        System.out.println(t1);
        
        System.out.println("lowest value :- "+ t1.pollFirst());
        System.out.println("highest value :- "+ t1.pollLast());
        
        
        TreeSet<String> s = new TreeSet<>();
        
           s.add("aaa");
             s.add("ppp");

             s.add("aaa");
             s.add("ghf");
             s.add("cbdg");
         System.out.println("set : "+ s);    
        System.out.println("Reverse set "+ s.descendingSet());   
        
        System.out.println("Head set "+  s.headSet("ghf",true));
             
        
        System.out.println("tail set "+  s.tailSet("ghf",true));
        
        
        System.out.println("sub set "+  s.subSet("aaa",true ,"ghf",false));
        
        
    }

}
