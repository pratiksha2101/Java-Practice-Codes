

public class Emp {

    int id;
    String name;
    
       void init() {
              id=11;
              name="meena";
       }
       
       void data(int x,String y)
       {
            id=x;
            name=y;
       }
      void Show() {
          
            System.out.println("show details...");
            System.out.println(id +" "+name);
            
      }
    
    
       

public static void main(String[] args) {


Emp e1 = new Emp();
    e1.init();
    e1.Show();  //
    
    e1.data(22, "heena");
    e1.Show();//
    
 Emp e2= new Emp();
 
     e2.data(33, "teena");
     e2.Show();
    

}

}


