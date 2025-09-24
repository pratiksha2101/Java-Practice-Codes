
public class sample {
	
	void show(sample obj)
	{
		System.out.println("show details..");
	}
	void disp(sample obj1)
	{
		show(this);
		System.out.println("display data...");
	}
	void ss(){
		disp(this);
		
		
	}

	public static void main(String[] args) {
		sample s1=new sample();
		s1.show(s1);
		s1.ss();

	}

}
