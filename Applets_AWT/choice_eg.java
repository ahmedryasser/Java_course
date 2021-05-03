/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applets_AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Ahmed Yasser
 */
public class choice_eg {

    public choice_eg() {
        Frame frm = new Frame("My First Frame");
        frm.setVisible(true);
        frm.setSize(500, 500);
        frm.setLayout(null);

        frm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        
        Choice ch=new Choice();
        ch.add("Apple");
        ch.add("Banana");
        ch.add("Kiwi");
        ch.add("Litchi");
        Button btn=new Button("Choose Item");
        Label res=new Label();
               
        ch.setBounds(50,50,100,50);
        btn.setBounds(50, 100, 100, 30);
        res.setBounds(50, 150, 100, 30);
        
        btn.addActionListener(new  ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {         
           res.setText(ch.getSelectedItem());
            }
        });
        
        frm.add(ch);
        frm.add(btn);
        frm.add(res);
    }

   
    public static void main(String[] args) {
        choice_eg c=new choice_eg();
        
    }
    
}
