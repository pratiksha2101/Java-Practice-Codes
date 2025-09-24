
public class Calculate {
    
          
       public Calculate() {
  
                System.out.println("default constructore..");
       
       }
           public Calculate(int x,int y) {
               
                 
               System.out.println("paramerise  constructore..with diff num of parameter "+ (x+y));
      
      }

           public Calculate(int x,float y) {
                   
                   System.out.println("parametrised constructore..with diff data type of parameter : " + (x+y));
          
          }
           public Calculate(float x,int y) {
               
               System.out.println("parametrised constructore..with diff sequence : " + (x+y));
      
      }
    
    

    public static void main(String[] args) {
        
            Calculate c1 = new Calculate();
            Calculate c2= new Calculate(2, 3);
            Calculate s3= new Calculate(22, 1.2f);
            

    }

}

