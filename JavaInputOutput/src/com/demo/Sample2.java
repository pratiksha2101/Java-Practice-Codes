package com.demo;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

public class Sample2 {

    public static void main(String[] args) throws IOException {
        File data= new File("D:\\CoreJava_24A103DS_4to6\\JavaInputOutput\\FileDemo1\\demo.txt");
       FileInputStream f= new FileInputStream(data);
       
       FilterInputStream filter = new BufferedInputStream(f);
       
         int i=0;
         while((i= filter.read())!=-1) 
         {
               System.out.print((char)i);
         }
         
              f.close();
           filter.close();
    }

}