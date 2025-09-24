package com.demo3;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.IOException;

public class Sample {
	
	public static void main(String[] args) {
		try {
			FileOutputStream f1 =new FileOutputStream("E:\\JAVA CORE\\ExeptionInHandling\\abc\\demo.txt");
					try {
						f1.write(65);
					}catch (IOException e) {
						
						e.printStackTrace();
					}
		}catch(FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		System.out.println("File 1 successfully created");
	}
	
	

	

}
