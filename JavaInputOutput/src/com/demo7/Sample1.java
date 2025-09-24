package com.demo7;

import java.io.BufferedWriter;

public class Sample1 {

	public static void main(String[] args)  throws IOException  {
		
           writer w1 = new FileWriter("D:\\CoreJava_24A103DS_4to6\\JavaInputOutput\\FileDemo1\\demo.txt");
           
           BufferedWriter b1 = new BufferWriter(w1);
           
           b1.write("write something in file...");
           
           b1.close();
           System.out.println("File Successfully created")
	}

}
