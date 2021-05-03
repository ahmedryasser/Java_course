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
public class NewApplet extends Applet {

   
    public void init() {
        setSize(500, 500);
        //setBackground(Color.GRAY);
    }
    
    public void paint(Graphics g)
    {
        g.setFont(new Font("Times New Roman", 1, 25));
        g.setColor(Color.red);
        g.drawString("Aptech Computer", 150, 50);
        g.drawLine(150, 80, 300, 80);
                
        g.drawRect(100, 100, 50, 50);
        g.setColor(Color.GREEN);
        g.fillRect(100, 100, 50, 50);
        g.drawOval(100, 150, 50, 50);
        g.setColor(Color.BLUE);
        g.fillOval(100, 150, 50, 50);
        g.drawRoundRect(100, 200, 50, 50, 25  ,  25);
        g.setColor(Color.red);
        g.fillRoundRect(100, 200, 50, 50, 25, 25);
        g.drawPolygon(new int[]{250,255,205}, new int[]{255,122,150}, 3);
        g.drawArc(100, 250, 100, 100, 200 ,  140);
    }
    
    // TODO overwrite start(), stop() and destroy() methods
}
