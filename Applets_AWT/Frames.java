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
import java.awt.event.WindowListener;

public class Frames {

    Frame frm;

    public Frames() {
        Frame frm = new Frame("My First Frame");
        frm.setVisible(true);
        frm.setSize(500, 500);
        frm.setLayout(null);

        frm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        
        Label lbl=new Label("Enter Name");
        lbl.setForeground(Color.red);
        TextField txt=new TextField();
        Button btn=new Button("Click ME");
        Label res=new Label();
        
        lbl.setBounds(50, 50, 100, 30);
        txt.setBounds(150, 50, 100, 30);
        btn.setBounds(150, 100, 100, 30);
        res.setBounds(150, 150, 100, 30);
        
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {               
                res.setText(txt.getText());
            }
        });
        
        
        frm.add(lbl);
        frm.add(txt);
        frm.add(btn);
        frm.add(res);
    }

    public static void main(String[] args) {
        Frames frm = new Frames();
    }

}
