
public class Employee3 {
    
      int id;
      String name;
      
      Employee3(String compname)
      {
              System.out.println("comapny name:- "+ compname);
      }
        
      Employee3(){
          this("Seven mnetore");
          
          
           System.out.println(" invoke me in  another constructor...");
      }
      
        Employee3(int id ,String name)
        {
              //this() can invoke current class constructor...
               this();
               
            //this can referred as current class  instance
             this.id=id;
             this.name=name;
              
            
        }
        void disp()
        {
            
              System.out.println("display data...");
        }
        
        void show()
        {
            // this can invoke current class method
//              this.disp();
              disp();
             System.out.println(id+" "+name);
        }

    public static void main(String[] args) {
     
           Employee3 e1= new Employee3(1, "meena");
           
             e1.show();

    }

}