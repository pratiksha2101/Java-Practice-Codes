package com.demo4;

import java.io.IOException;

public class test {

	public static void main(String[] args) {
		Parent p;
		p=new Child();
		try {
			p.show();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			p.add();
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
