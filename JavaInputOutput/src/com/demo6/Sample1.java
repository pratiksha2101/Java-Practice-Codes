package com.demo6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Sample1 {
	
	public static void main(String[] args) throws IOException{
		
		Writer w1 = new FileWriter("D:\\CoreJava_24A103DS_4to6\\JavaInputOutput\\FileDemo1\\demo1.txt");
		
		w1.write("write something in file...");
		
		w1.close();
		System.out.println("file successfully created..");
	}

}
