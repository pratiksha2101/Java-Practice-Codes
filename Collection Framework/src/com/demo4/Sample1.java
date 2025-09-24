package com.demo4;

import java.util.Vector;
import java.util.Collections;

public class Sample1 {

	public static void main(String[] args) {
		
		
		Vector < String> v= new Vector<>();
		v.add("ee");
		v.add("ppp");
		v.add("oo");
		
		//adding element using addelement
		v.addElement("kkk");
		
		System.out.println(v);
		for (String s :v)
		{
			System.out.println(s);
		}
		
		System.out.println(v.size());
		
		Collections.sort(v);
        System.out.println("after sort :" + v);
        
        v.removeElementAt(0);
        System.out.println(v);
        
        System.out.println(v.remove(2));
        
        System.out.println(v);
				

	}

}