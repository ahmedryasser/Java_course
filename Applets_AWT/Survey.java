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
public class Survey {

    Frame frm;
    
    public Survey() {
        
        Frame frm = new Frame("My Frame");
        frm.setVisible(true);
        frm.setSize(500, 500);
        frm.setLayout(null);
        
        frm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Label re1 = new Label("Are you happy with our service? ");        
        Checkbox chk1 = new Checkbox("Yes");
        Checkbox chk2 = new Checkbox("No");
        Button btn = new Button("Click");
        Label re = new Label();
        
        re1.setBounds(50, 70, 200, 30 );
        chk1.setBounds(50, 100, 200, 30);
        chk2.setBounds(50, 130, 200, 30);
        btn.setBounds(50, 160, 200, 30);
        re.setBounds(50, 190, 200, 30);
        
        btn.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                if (chk1.getState()) {
                    re.setText("Thank you for time");
                }
                else if (chk2.getState()) {
                    re.setText("Thank you for time, We'll try to meet your expectation next time");
                }
                else{
                    re.setText("Please choose a box");

                }
            }
        });
        
        frm.add(chk1);
        frm.add(chk2);
        frm.add(re1);
        frm.add(btn);
        frm.add(re);
        
    }
    
    public static void main(String[] args) {
        Survey ch = new Survey();
    }
    
}
