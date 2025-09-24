package com.demo3;

import java.util.LinkedList;

public class Sample3 {

    public static void main(String[] args) {
        LinkedList<String> l1= new LinkedList<>();
          l1.add("sss");
          l1.add("gggg");
          l1.add("aaaa");
          l1.add("sss");
          l1.add("sss");
          l1.add("xxxx");
          
          System.out.println(l1);
//          System.out.println("remove : "+ l1.remove());
          System.out.println("peek :- " + l1.peek());
          
          
          System.out.println("peek :- " + l1.peekFirst());
          
          System.out.println("peek :- " + l1.peekLast());
          
          
          System.out.println("poll :- " + l1.poll());

          System.out.println("after poll : "+l1);
          
          System.out.println("poll :- " + l1.pollFirst());

          System.out.println("after poll : "+l1);
          
          System.out.println("poll :- " + l1.pollLast());

          System.out.println("after poll : "+l1);
          

    }

}