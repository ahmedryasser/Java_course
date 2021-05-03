/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Applets_AWT;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author Ahmed Yasser
 */
public class Trying_out_graphics extends Applet {

   
    public void init() {
        setSize(500, 500);
        //setBackground(Color.GRAY);
    }
    
    public void paint(Graphics g)
    {

        g.drawLine(50, 100, 100, 100);
        g.drawLine(350, 100, 400, 100);
        g.drawArc(100, 250, 250, 100, 200, 140);
        g.drawOval(0, 0, 450, 450);
    }
    
    // TODO overwrite start(), stop() and destroy() methods
}
