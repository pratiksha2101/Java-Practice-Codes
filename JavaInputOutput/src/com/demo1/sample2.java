package com.demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;

public class sample2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f1= new FileInputStream("E:\\JAVA CORE\\JavaInputOutput\\FileDemo1\\new-1");
		
		//int x=f1.read();
		//System.out.println(x +" "+(char)x );
		
		int x=0;
		while((x=f1.read())!=-1)
		{
			System.out.print((char)x);
		}
		
		f1.close();
		     
		

	}

}
