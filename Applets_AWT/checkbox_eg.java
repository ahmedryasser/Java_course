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
public class checkbox_eg {

    Frame frm;
    
    public checkbox_eg() {
        
        Frame frm = new Frame("My First Frame");
        frm.setVisible(true);
        frm.setSize(500, 500);
        frm.setLayout(null);
        
        frm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Checkbox chk1 = new Checkbox("Do you want to continue");
        Button btn = new Button("Click");
        Label re = new Label();
        
        chk1.setBounds(50, 50, 150, 30);
        btn.setBounds(50, 100, 100, 30);
        re.setBounds(50, 150, 10, 30);
        
        btn.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                if (chk1.getState()) {
                    re.setText("Yes you can continue");
                } else {
                    re.setText("No Please Try Again!!!");
                }
            }
        });
        
        frm.add(chk1);
        frm.add(btn);
        frm.add(re);
        
    }
    
    public static void main(String[] args) {
        checkbox_eg ch = new checkbox_eg();
    }
    
}
