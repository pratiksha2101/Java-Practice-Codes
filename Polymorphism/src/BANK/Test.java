package BANK;

public class Test {

	public static void main(String[] args) {
		
		Bank b1;
		
		b1=new HDFC();
		System.out.println("HDFC Rate of Interest"+b1.getRateOfinterest());
		
		b1=new Axis();
		System.out.println("Axis Rate of Interest"+b1.getRateOfinterest());
		
		b1=new Union();
		System.out.println("Union Rate of Interest"+b1.getRateOfinterest());
		

	}

}
