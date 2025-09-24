package this2demos;

public class Employee {
	int id;
	String name;
	
	DOJ d1;
	
	//step 4
	Employee(int id,String name, DOJ d1)
	{
		this.id=id;
		this.name=name;
		this.d1=d1;
	}
	
	//step 6
	void display()
	{
		System.out.println(id+" "+name);
		System.out.println(d1.date+" "+d1.month+" "+d1.year);
	}

}
