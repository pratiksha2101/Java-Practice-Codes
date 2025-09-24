
public class Employee {
	
	int id;
	String name;
	String compName;
	
	public Employee()
	{
		System.out.println("default constructor....");
		compName="seven mentor";
	}
	void show()
	{
		System.out.println(id+" "+name+" "+compName);
		
	}
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		
		e1.show();
		Employee e2=new Employee();
		e2.show();

	}

}
