package com.demo;

public class Sample9 {

    public static void main(String[] args) {
        
            //join
          // which is used to retrun string join with  delimeter
        
        
        String s1 = String.join("-", "welcome","to","seven mentore");
          System.out.println(s1);
          
           String s2 = String.join("/" ,"11","2","2023");
           
           System.out.println(s2);
           
//           String s3=null;
//           
//             s3 = String.join(null, "aaa","nnn");
//             
//              System.out.println(s3);   throw null pointer exception
           
           String s3=null;
           
             s3 = String.join("$", "aaa","nnn");
             
              System.out.println(s3);
           
           
//              String s33=null;
////               
//                 s33 = String.join("$", null);   compile time exception
//                 
//                  System.out.println(s33);   
//    }

}
}