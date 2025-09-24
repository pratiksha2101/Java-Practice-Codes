package com.demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Sample2 {

    public static void main(String[] args) {
        
        JFrame f1 = new JFrame();
        JLabel lable = new JLabel();
        lable.setBounds(30, 150, 200, 50);
        
        JLabel l2 = new JLabel("password");
        l2.setBounds(30, 75, 80, 30);
         JPasswordField value= new JPasswordField();
         value.setBounds(100, 80, 100, 30);
         
            JLabel l1 = new JLabel("username");
            l1.setBounds(30, 20, 80, 30);
            JTextField  text = new JTextField();
            text.setBounds(100, 20, 100, 30);
            
             
        
            
             
            JButton b= new JButton("login");
            b.setBounds(100, 120, 80, 30);

            
        
            
            
            f1.add(value);
            f1.add(l1);
            f1.add(l2);
            f1.add(b);
            f1.add(text);
            f1.add(lable);
            
            f1.setSize(300,300);
            f1.setLayout(null);
            f1.setVisible(true);
        
        // Anonymous inner class
            b.addActionListener(new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent e) {
                
                            String data = " username " +  text.getText();
                            data+="   password " + new String(value.getPassword());
                            
                            lable.setText(data);
                            
                    
                }
            });
        
        

    }

}