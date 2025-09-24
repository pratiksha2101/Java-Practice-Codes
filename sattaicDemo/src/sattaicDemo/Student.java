package sattaicDemo;

public class Student {

    // non static variabe
            int roll;
            String name;
            // static variablel
            static String clg_name="Seven Mentor";

      public Student(int x,String y) {
        // TODO Auto-generated constructor stub
          
              roll=x;
              name=y;
              
              
    }
      
      // non static method
        void disp()
        {
             System.out.println(roll +" "+name +" "+clg_name);
        }
        
        // static method
        static void show() 
        {
            System.out.println("static methodd initilize...");
            System.out.println(clg_name);
        }
            
            

public static void main(String[] args) {
   Student s1= new Student(1,"meena");
   s1.disp();
   Student s2= new Student(2,"heena");
   s2.disp();
   
//    show();
   Student.show();
   
}

}
