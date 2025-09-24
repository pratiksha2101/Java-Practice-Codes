package com.Packagetwo;

//import com.packageOne.Employee;
import com.PackageOne.*;

public class TestEMp {

    public static void main(String[] args) {
        
        
        
          Employee e= new Employee();
//          e.empshow();  default method not accesseble outside the packge...
           e.showemp1();  // public method can accessible outside the the packge
           
    Student s1 =new Student();
    
      s1.studentshow();
            

           
    }
}
