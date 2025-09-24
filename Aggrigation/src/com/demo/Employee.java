package com.demo;

public class Employee {
	int id;
	String name;
	
	DOJ d1;  //aggrigation HAS-A
	Address address;
	
	public Employee(int id,String name,DOJ d1,Address address) {
		this.id=id;
		this.name=name;
		this.d1=d1;
		this.address=address;
	}
	void display()
	{
		System.out.println(id+" "+name);
		System.out.println("date:- "+d1.date+" "+d1.month+" "+d1.year);
		System.out.println("address:- "+address.city+" "+address.pinno);
	}

}
