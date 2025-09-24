package com.practicehierarchicalInheritance;

public class Rectangle extends Shape {
	void area()
	{
		int breadth=5;
		//calculate area of rectangle
		int area=length*breadth;
		
		System.out.println("Area of Rectangle : "+area);
	}

}
