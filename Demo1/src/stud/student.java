package stud;

public class student {
	
	//data member
	int roll=11;
	String name="meena";
	float marks;
	
	public static void main(String arg[])
	{
		System.out.println("Learn java with pratiksha...");
		
		//object creation
		
		student obj=new student();
		//new is used for dynamic memory allocation
		
		System.out.println(obj.roll + " \n " +obj.name);
		
		obj.marks=2000.3f;
		System.out.println(obj.marks);
	}

}
