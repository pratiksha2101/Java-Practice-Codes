package com.demo;

public class employee implements Cloneable {
	
	int id;
	String name;
	
	
	public employee(int id, String name) {
		super();
		this.id =id;
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + "]";
	}
	

}
