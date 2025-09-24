package com.demo;

import java.io.Serializable;

public class Employee implements Serializable {
	int id;
	String name;
	float salary;
	public Employee(int id, String name, Float salary) {
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

}
