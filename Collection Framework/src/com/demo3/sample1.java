package com.demo3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class sample1 {

    public static void main(String[] args) {
    
        LinkedList<String>  list = new LinkedList<>();
        
             list.add("meena");
             list.add("heena");
             list.add("heena");
             list.add("teena");
             list.add("priya");
             
             System.out.println(list);
             
             
             //iteration
             
             Iterator<String>  i= list.iterator();
             
             
             while(i.hasNext())
             {
                  System.out.println(i.next());
             }
             
             
             // for each
             System.out.println("using for each");
                for(String s : list) 
                {
                    System.out.println(s);
                }
             
             
             
            ArrayList<String> list1 = new ArrayList<>();
            
              list1.add("new1");
              list1.add("new2");
              
              System.out.println("Arraylist : " + list1 );
              
              list1.addAll(list);
             
              System.out.println("list : "+ list1);
             

    }

}