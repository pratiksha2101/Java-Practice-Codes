public class Employee2 {
    
    
    int id;
    String name;
    int salary;
     Employee2(int id, String name)
     {
           this.id=id;
           this.name=name;
           System.out.println("one");
     }
    
     public Employee2() {
          this(11,"meena");
          System.out.println("two");
        
    }
     
     
     Employee2(int id ,String name,int salary){
         
              this(id,name);
              this.salary=salary;
              System.out.println("three");
              
              
         
     }

     void show()
     {
         System.out.println(id+"  " +name);
     }
     
    public static void main(String[] args) {
        
        Employee2 e1= new Employee2(1, "meena", 2008);
        e1.show();
        
        Employee2 e2= new Employee2(1, "Heena");
        e2.show();
        

    }

}
