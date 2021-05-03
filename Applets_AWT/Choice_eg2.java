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
public class Choice_eg2 {

    public Choice_eg2() {
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
        TextField txt = new TextField();
        Button btn = new Button("Add Item");
        Label res = new Label();

        txt.setBounds(50, 50, 100, 30);
        ch.setBounds(50,150,100,30);
        btn.setBounds(50, 125, 100, 30);
        res.setBounds(50, 150, 100, 30);

        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ch.add(txt.getText());
            }
        });

        frm.add(ch);
        frm.add(btn);
        frm.add(res);
        frm.add(txt);
    }

    public static void main(String[] args) {
        Choice_eg2 c = new Choice_eg2();

    }

}
