package sattaicDemo;


public class Calculate {
    
    static int num=0;
   
   Calculate()
   {
        System.out.println(num);   // 0  1
        num++;   //1 2
        System.out.println(num);  //1  2
         
   }
   
     

   public static void main(String[] args) {
       
       System.out.println("object one");
          Calculate s= new Calculate();
          
           System.out.println("object two");
           
          Calculate s1= new Calculate();

   }

}
