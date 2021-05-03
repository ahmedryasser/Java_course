/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applets_AWT;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Ahmed Yasser
 */
public class radio_btn {
Frame frm;
    public radio_btn() {
    Frame frm = new Frame("My Frame");
        frm.setVisible(true);
        frm.setSize(500, 500);
        frm.setLayout(null);
        
        frm.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        CheckboxGroup chk=new CheckboxGroup();
        
        Checkbox male=new Checkbox("Male",false,chk);
        Checkbox Female=new Checkbox("Female",false,chk);
        Button btn=new Button("Choose");
        Label res=new Label();
        
        btn.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
       if(male.getState())
           res.setText("Male");
       else if (Female.getState())
           res.setText("Female");
        
        }
    });
        
        male.setBounds(50, 50, 100, 30);
        Female.setBounds(150, 50, 100, 30);
        btn.setBounds(50, 100, 100, 30);
        res.setBounds(50, 150, 100, 30);
        
        frm.add(male);
        frm.add(Female);
        frm.add(btn);
        frm.add(res);
        
    }

    
    public static void main(String[] args) {
       radio_btn r=new radio_btn();
    }
    
}
