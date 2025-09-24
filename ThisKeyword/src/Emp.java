public class Emp {
     
    int id;
    String name;
     Emp()
     {
          System.out.println("employee details....");
     }
    
     Emp(int id , String name)
     {
           this();  // it is invoke a default constructore ...
          this.id=id;
          this.name=name;
          
          
        
          System.out.println(" with value...");
     }
     
     void dips()
     {
          System.out.println(id+" "+name);
     }
       

    public static void main(String[] args) {
        
//        Emp e= new Emp();
        Emp e1= new Emp(111, "meena");
        e1.dips();
        Emp e2= new Emp(122, "Hena");
        e2.dips();

    }

}
