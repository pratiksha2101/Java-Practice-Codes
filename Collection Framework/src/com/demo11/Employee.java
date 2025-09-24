package com.demo11;

public class Employee implements Comparable<Employee>{
	public int id;
	public String name;
	public int age;
	
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Employee o) {
		
		
		if(age==o.age)
		{
			
		
		return 0;
		}else if(age>o.age)
		{
			return 1;
		}else
		{
			return -1;
		}
		
	}

}
