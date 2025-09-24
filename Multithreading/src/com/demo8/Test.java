package com.demo8;



public class Test {

    public static void main(String[] args) {
        
        SnapChat s1= new  SnapChat();
    
        new Mythread(s1);
        
        new MyThread2(s1);
        
    }

}
