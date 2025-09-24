package com.demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Sample1 extends JFrame implements ActionListener{

              JFrame f;
              JTextArea t2;
              JLabel l1;
              public Sample1() {
                
                    JButton b1=new JButton("cout words");
                    b1.setBounds(140, 100, 100, 50);
                    
                    b1.addActionListener(this);
                    
                    l1= new JLabel();
                    l1.setBounds(140, 170, 250, 40);
                    
                    JTextField t1= new JTextField();
                    t1.setBounds(140, 200, 250, 40);
                    
                    t2= new JTextArea();
                    t2.setBounds(140, 250, 200, 40);
                    
                    
                    
                    
                    add(b1);
//                    add(t1);
                    add(l1);
                    add(t2);
                    setSize(500, 500);
                   
                   setLayout(null);
                    setVisible(true);
                  
            }
    
              @Override
            public void actionPerformed(ActionEvent e) {
                
                       String text = t2.getText();
                       String word[] = text.split("\s");
//                      for(String w1 : word)
//                      {
//                            System.out.println(w1);    
//                      }
                       
                      l1.setText(" Words:- "+  word.length);
                
            }
    
    public static void main(String[] args) {
    
        Sample1 s= new Sample1();

    }





}