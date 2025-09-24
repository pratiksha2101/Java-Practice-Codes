package com.demo10;

import java.util.EnumMap;
import java.util.Map;

public class Sample2 {

	public static void main(String[] args) {
		
		
		EnumMap<Days,String> e=new EnumMap<Days,String>(Days.class);
		
		e.put(Days.sunday, "one");
		e.put(Days.monday, "two");
		e.put(Days.tuesday, "three");
		
		System.out.println(e);
		
		for(Map.Entry<Days,String>e1: e.entrySet())
		{
			System.out.println(e1.getKey()+" : "+e1.getValue());
		}

	}

}
