package com.practicehierarchicalInheritance;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Square sq=new Square();
        Rectangle rec=new Rectangle();
        Circle cir=new Circle();
        
        //call the area method of all child class 
        sq.area();
        rec.area();
        cir.area();
	}

}
