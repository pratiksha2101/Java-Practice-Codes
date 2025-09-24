package com.demo12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.demo11.Employee;

public class testemp {

	public static void main(String[] args) {
		
		ArrayList<Employee> a1= new ArrayList<>();
		a1.add(new Employee(1,"meena",20));
		a1.add(new Employee(1,"heena",27));
		a1.add(new Employee(1,"teena",30));
		a1.add(new Employee(1,"reena",18));
		
		System.out.println("by Name sort");
		Collections.sort(a1,new NameComparatore());
		Iterator i = a1.iterator();
		while(i.hasNext())
		{
			Employee e1=(Employee) i.next();
			System.out.println(e1.id+" "+e1.name+" "+e1.age);
		}
		System.out.println("by age sort");
		Collections.sort(a1,new AgeComparatore());
		
		Iterator i1 = a1.iterator();
		while(i.hasNext())
		{
			Employee e1=(Employee) i.next();
			System.out.println(e1.id +" "+e1.name+" "+e1.age);
		}
		
		
		
	}

}
