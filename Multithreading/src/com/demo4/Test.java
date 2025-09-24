package com.demo4;

public class Test {

    public static void main(String[] args) {
        
        
            Meena m= new Meena();
            
                Heena h1= new Heena("hey hi how r you", m);
                
                Heena h2= new Heena("whats up...", m);  
                
                h1.start();
                h2.start();
                
                4
                     try {
                        h1.join();
                        h2.join();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                   
    }

}

