package com.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class Sample1 {

    public static void main(String[] args) throws IOException {
        
        File data= new File("D:\\CoreJava_24A103DS_4to6\\JavaInputOutput\\FileDemo1\\demo.txt");
        
        
        FileOutputStream file= new FileOutputStream(data);
        
        
        FilterOutputStream filter= new FilterOutputStream(file);
        
        
        String s="welcoem to learn java";
        
          byte x[]=s.getBytes();
          
          filter.write(x);
          
          filter.flush();
          
          filter.close();
          
          
          System.out.println("file successfully created....");
        
        
        
        

    }

}