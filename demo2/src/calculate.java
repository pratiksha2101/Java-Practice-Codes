
public class calculate {


int Add() {
	return 2+3;
}
int Sub(int x,int y) {
	return x-y;
}

public static void main(String[] args) {
	calculate c1=new calculate();
	int ans = c1.Add();
	
	System.out.println("Addition:- "+ ans);
	System.out.println("Subtraction:- "+ c1.Sub(5, 2));
}
}