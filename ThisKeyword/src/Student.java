
public class Student {
      
       int roll;
       String name;
       //indexing
          Student(int roll, String name)
          {
               this.roll=roll;
               this.name=name;
              
          }
          void disp() {
                System.out.println("display student details...");
          }
          void show() {
//                this.disp();
                 disp(); // this is used invoke implicity call method
              
                System.out.println(roll +" "+name);
          }
    
    

    public static void main(String[] args) {
    
           Student s1 = new Student(22, "meena");
           

            s1.show();
           
           Student s2 = new Student(12, "heena");
           

            s2.show();
           
           
          

    }

}