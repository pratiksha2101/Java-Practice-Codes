package com.demo1;
import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.IOException;

public class Sample1 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream f1 = new FileOutputStream("E:\\JAVA CORE\\JavaInputOutput\\FileDemo1\\new-1");
		
		f1.write(65);
		
		String s1="welcome to learn java...";
		
		byte s2[]=s1.getBytes();
		
		f1.write(s2);
		
		System.out.println("File created successfully...");
		
		f1.close();
		

	}

}
