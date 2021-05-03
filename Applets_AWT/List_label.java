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
public class list_label {

    /**
     * @param args the command line arguments
     */
    Frame frm;

    public list_label() {
        Frame frm = new Frame("My Frame");
        frm.setVisible(true);
        frm.setSize(500, 500);
        frm.setLayout(null);

        frm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        List lst = new List(5);
        Button btn = new Button("Show");
        Label res = new Label();
        
        lst.add("Apple");
        lst.add("Mango");
        lst.add("Pine apple");
        lst.add("Berry");
        lst.add("Kiwi");
        lst.add("Orange");
        lst.add("Banana");
        
        lst.setBounds(50, 50, 150, 50);
        btn.setBounds(50, 110, 150 , 30);
        res.setBounds(50, 150, 150, 30);
        
        btn.addActionListener(new  ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {         
        res.setText(lst.getSelectedItem());
            }
        });
        
        frm.add(lst);
        frm.add(btn);
        frm.add(res);
    }

    public static void main(String[] args) {

        list_label e = new list_label();
    }

}
