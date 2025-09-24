package com.demo4;

import java.io.IOException;

public class Child extends Parent {
	
	void show()throws IOException{
		System.out.println("parent class method...");
	}
	void add() {
		int num= 5/0;
		System.out.println(num);


}
}
