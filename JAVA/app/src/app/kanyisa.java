/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author TREVOR
 */
public class kanyisa extends Applet{
    public void paint(Graphics g){
       setBackground(Color.YELLOW);
     
        g.setColor(Color.red);
        g.fillOval(50, 50, 100, 100);
        //g.drawOval(50, 50, 100,100);
    }
    
}
