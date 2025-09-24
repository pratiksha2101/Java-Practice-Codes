public class Emp {
   
            int id;
            String name;
            String compName;
            
              
              
              public Emp(int x,String y) 
              {
                  System.out.println("parametrised constructore...");
                    id=x;
                    name=y;
                    compName="Seven Mntore";
              }
              
              void dispaly()
              {
                   System.out.println(id +"  "+name+" "+compName);
              }
              
              
              public static void main(String []args)
              {
                  
                      
                      Emp e1= new Emp(2, "meena");
                      e1.dispaly();
                      
                      Emp e2= new Emp(3, "heena");
                      e2.dispaly();
              }
    
}
