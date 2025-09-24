package com.demo6;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Sample2 {
	
	public static void main(String[] args) throws IOException{
		Reader r = new FileReader("D:\\CoreJava_24A103DS_4to6\\JavaInputOutput\\FileDemo1\\demo1.txt");
		
		int i;
		while((i=r.read())!=-1) {
			System.out.print((char)i);
		}
	}
}
