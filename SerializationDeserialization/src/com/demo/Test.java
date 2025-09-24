package com.demo;

import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) {
		Employee e = new Employee(1,"meena",200.0f);
		
		FileOutputStream f1= new FileOutputStream("E:\\JAVA CORE\\SerializationDeserialization\\File.demo\\dumy.demo");
		
		ObjectOutputStream o = new ObjectOutputStream(f1);
		
		o.writeObject(e);
		System.out.println("duccessfully data write..");
		
		//deserialization
		
		ObjectInputStream o1= new ObjectInputStream(new FilterInputStream("E:\\JAVA CORE\\SerializationDeserialization\\File.demo\\dumy.demo");
		
		Employee e2=(Employee)o1.readObject();
		System.out.println(e2.id+" "+e2.name+" "+e2.salary);

	}

}
