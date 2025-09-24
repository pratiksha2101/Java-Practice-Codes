package com.demo2;

public class College {
    
    String name;
    
     College()
     {
          System.out.println("colllage class. constructore");
     }
     
     
     College(String name)
     {
         System.out.println("colllage class. parametrised constructore");
           this.name=name;
           
     }

}