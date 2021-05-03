/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applets_AWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Ahmed Yasser
 */
public class list_Eg {

    /**
     * @param args the command line arguments
     */
    Frame frm;

    public list_Eg() {
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
        lst.add("Apple");
        lst.add("Mango");
        lst.add("Pine apple");
        lst.add("Berry");
        lst.add("Kiwi");
        lst.add("Orange");
        lst.add("Banana");
        
        
        lst.setBounds(50, 50, 150, 50);
        
        frm.add(lst);
    }

    public static void main(String[] args) {

        list_Eg e = new list_Eg();
    }

}
