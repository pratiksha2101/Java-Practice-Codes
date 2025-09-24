
public class Student {
    
    int roll;
    String name;
    
     Student()
     {
            roll=11;
            name="meena";
            
     }
     Student(Student s1 ){
         
         System.out.println("copy constructore");
             roll=s1.roll;
             name=s1.name;
     }
     
     void show()
     {
           System.out.println(roll+" "+name);
     }

    public static void main(String[] args) {
        
        Student s1= new Student();
        s1.show();
        Student s2= new Student(s1);
        s2.show();

    }
}
