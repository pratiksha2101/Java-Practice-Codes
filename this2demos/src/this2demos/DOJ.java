package this2demos;

public class DOJ {
	int date;
	String month;
	int year;
	
	DOJ(int date, String month,int year)  //step2
	{
		this.date=date;
		this.month=month;
		this.year=year;
		
		//step 3
		Employee e1 = new Employee(1,"meena",this); //Employee class constructor call here
		
		//step 3
		e1.display();
	}
	public static void main(String []args) {
		DOJ d=new DOJ(1,"jan",2023);  //step 1
	}

}
