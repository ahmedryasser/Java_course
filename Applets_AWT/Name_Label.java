/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applets_AWT;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Name_Label extends Applet {

    Frame frm;

    public Name_Label() {
        Frame frm = new Frame("My First Frame");
        frm.setVisible(true);
        frm.setSize(500, 500);
        frm.setLayout(null);

        frm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        
        Label name=new Label("First Name");
        TextField txt=new TextField();
        Label name1=new Label("Last Name");
        
        TextField txt1=new TextField();        
        Button btn=new Button("Full Name");
        Label res=new Label();
      
        name.setBounds(50, 50, 100, 30);
        name1.setBounds(50, 150, 100, 30);
        txt.setBounds(150, 50, 100, 30);
        txt1.setBounds(150, 150, 100, 30);
        btn.setBounds(50, 250, 75, 30);
        res.setBounds(150, 250, 100, 30);
      
       btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                res.setText(txt.getText()+" "+txt1.getText());
            }
        });
       
        
        frm.add(name1);
        frm.add(name);
        frm.add(txt);
        frm.add(txt1);
        frm.add(btn);
        frm.add(res);
        
    }

    public static void main(String[] args) {
        Name_Label frm = new Name_Label();
    }

}
