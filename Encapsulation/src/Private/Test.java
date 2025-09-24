package Private;

public class Test {

	public static void main(String[] args) {
		
		Employee e1= new Employee(1,"meena",2000.5f);
		
		System.out.println(e1.getId());
		
		e1.setId(2222);
		e1.setName("Meena");
		e1.setSalary(2000.5f);
		
		System.out.println(e1.getId() + " "+e1.getName() +" "+e1.getSalary());

	}

}
