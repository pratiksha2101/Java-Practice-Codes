package com.demo10;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;

public class Sample1 {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter p = new PrintWriter(System.out);
		
		p.write("welcome to learn java...");
		
		p.flush();
		p.close();
		
		PrintWriter out = new PrintWriter("E:\\JAVA CORE\\JavaInputOutput\\FileDemo1\\dumy.text");
		
		out.write("join my java classess...");
		
		out.flush();
		out.close();
				
		

	}

}
