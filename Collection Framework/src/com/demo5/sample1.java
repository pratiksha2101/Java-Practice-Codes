package com.demo5;

import java.util.Stack;

public class sample1 {

	public static void main(String[] args) {
	
		
		Stack<Integer> s1=new Stack<>();
		
		s1.push(22);
		s1.push(33);
		s1.push(44);
		s1.push(36);
		s1.push(32);
		System.out.println(s1);
		System.out.println("is empty "+ s1.isEmpty());
		
		s1.pop();
		System.out.println(s1);
		
		System.out.println(s1.pop());
		
		System.out.println(s1.remove(1));
		
		
		//search
		int l1=s1.search(33);
		System.out.println("location of 33 : "+l1);
		System.out.println(s1.peek());
	}

}
