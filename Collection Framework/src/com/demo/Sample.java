package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sample {

    public static void main(String[] args) {
    
        List<Integer> l1= new ArrayList<Integer>();
        
          l1.add(22);
          l1.add(33);
          l1.add(44);
          l1.add(22);
          
          
          System.out.println(l1);
          
          // to travrse the list we can use itrtion
          
          Iterator< Integer>  i  = l1.iterator();
            
             while(i.hasNext())
             {
                  System.out.println(i.next());
             }
          
          // Another way to tarverse data  using for each
             
             System.out.println("using for each");
             
               for(int x :  l1) {
                   
                     System.out.println(x);
                   
               }
             
             
               
               l1.add(777);
               
               System.out.println(l1);
               //get()
             
             System.out.println(l1.get(3));
             
             // remove
             
              l1.remove(2);
              System.out.println("after remove " + l1);
              
           
              
             
         ArrayList<Integer>  a1 = new ArrayList<>();
         
            a1.add(55);
            a1.add(88);
            
            System.out.println(a1);
            
            a1.addAll(l1);
           
            System.out.println(a1);
             
             
            //isEmpty
            
              System.out.println("isEMpty: "+ a1.isEmpty());
              
              // indexOf
              
              System.out.println("indexof "+ a1.indexOf(22));
              System.out.println("indexof "+ a1.lastIndexOf(22));
              
              // contain 
              System.out.println("conatins  "+  a1.contains(88));
              
        
            
              
//              a1.remove(6);  // indexOutOfBond exception occurd
//              System.out.println(a1);


              //removeIF
              
                 ArrayList<Integer> a2= new ArrayList<>();
                   a2.add(22);
                   a2.add(33);
                   a2.add(66);
                   
                   //lamabda expression
                 a2.removeIf(p->(p%3==0));
                     
                   System.out.println(a2);
                   
                   
          ArrayList<String>  s1= new ArrayList<>();
            s1.add("aaa");
            s1.add("ppp");
            s1.add("ppp");
            
            System.out.println(s1);
                   
                for(String s : s1)
                {
                     System.out.println(s);
                }     
              
                s1.removeIf(n->(n.charAt(0)=='p'));
                
                System.out.println(s1);
                
    }

}