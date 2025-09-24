public class Employee {
    
    int id;
    String name;
     Employee(int id, String name)
     {
           this.id=id;
           this.name=name;
           System.out.println("one");
     }
    
     public Employee() {
          this(11,"meena");
         System.out.println(id+"  " +name);
    }

    public static void main(String[] args) {
      
           Employee e = new Employee();

    }

}
