package com.Memberinnerclass;

import com.Memberinnerclass.Outer.Inner;

public class Test {

	public static void main(String[] args) {
		  
		Outer o1=new Outer();
		o1.show();  //outer class method
		Outer.Inner i=o1.new Inner();
		i.disp(); 
		

	}

}
