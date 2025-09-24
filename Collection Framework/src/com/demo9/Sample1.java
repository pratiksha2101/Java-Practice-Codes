package com.demo9;

import java.util.LinkedHashMap;

public class Sample1 {

    public static void main(String[] args) {
    
        
        LinkedHashMap<String, Integer> l1= new LinkedHashMap<>();
        
        l1.put("aa", 111);
        l1.put("ab", 121);
        l1.put("ac", 1121);
        
        l1.put("ad", 1112);
        l1.put("ae", 11134);
        
        
        System.out.println(l1);
        
        System.out.println(l1.get("aa"));
        
    System.out.println(    l1.keySet());
    System.out.println(l1.values());
    
    
        
        
    }

}