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


public class calculator extends Applet {

    Frame frm;

    public calculator() {
        Frame frm = new Frame("My First Frame");
        frm.setVisible(true);
        frm.setSize(500, 500);
        frm.setLayout(null);

        frm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        
        Label name=new Label("First number");
        TextField txt=new TextField();
        Label name1=new Label("Second number");
        
        TextField txt1=new TextField();        
        Button btn=new Button("Add");
        Label res=new Label();
        Button subbtn=new Button("Subtract");
        Label subres=new Label();
        Button divbtn=new Button("Divide");
        Label divres=new Label();
        Button multbtn=new Button("Multiply");
        Label multres=new Label();

      
        name.setBounds(50, 50, 100, 30);
        name1.setBounds(50, 150, 100, 30);
        txt.setBounds(150, 50, 100, 30);
        txt1.setBounds(150, 150, 100, 30);
        btn.setBounds(50, 250, 75, 30);
        res.setBounds(150, 250, 100, 30);
        subbtn.setBounds(50, 300, 75, 30);
        subres.setBounds(150, 300, 100, 30);
        divbtn.setBounds(50, 350, 75, 30);
        divres.setBounds(150, 350, 100, 30);
        multbtn.setBounds(50, 400, 75, 30);
        multres.setBounds(150, 400, 100, 30);
      
       btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(txt.getText());
                int b=Integer.parseInt(txt1.getText());
                int r=a+b;
                res.setText(String.valueOf(r));
            }
        });
       subbtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(txt.getText());
                int b=Integer.parseInt(txt1.getText());
                int r=a-b;
                subres.setText(String.valueOf(r));
            }
        });
       divbtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(txt.getText());
                int b=Integer.parseInt(txt1.getText());
                int r=a/b;
                divres.setText(String.valueOf(r));
            }
        });
       multbtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(txt.getText());
                int b=Integer.parseInt(txt1.getText());
                int r=a*b;
                multres.setText(String.valueOf(r));
            }
        });
       
        
        frm.add(name1);
        frm.add(name);
        frm.add(txt);
        frm.add(txt1);
        frm.add(btn);
        frm.add(res);
        frm.add(subbtn);
        frm.add(subres);
        frm.add(divbtn);
        frm.add(divres);
        frm.add(multbtn);
        frm.add(multres);
    }

    public static void main(String[] args) {
        calculator frm = new calculator();
    }

}
