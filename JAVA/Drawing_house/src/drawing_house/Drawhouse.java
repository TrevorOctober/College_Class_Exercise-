/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing_house;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author TREVOR
 */
public class Drawhouse extends Applet {
    public void init(){
        setSize(350,300);
        
    }
    public void paint(Graphics g){
        setBackground(Color.CYAN);
         
        //draw clouds
        g.setColor(Color.WHITE);
        g.fillOval(30, 30, 40, 40);
        g.fillOval(60, 30, 40, 40);
        g.fillOval(80, 30, 40, 40);
        g.fillOval(40, 10, 40, 40);
        g.fillOval(70, 10, 40, 40);
        
        g.fillOval(160, 10, 20, 20);
        g.fillOval(175, 10, 20, 20);
        g.fillOval(190, 10, 20, 20);
        g.fillOval(170, 20, 20, 20);
        g.fillOval(185, 20, 20, 20);
        
        //Draw the roof
        g.setColor(Color.red);
        int x5[]={100,160,220};
        int y5[]={100,50,100};
        Polygon poly=new Polygon(x5,y5,3);
        g.fillPolygon(poly);
        
        //draw the body of house
        g.setColor(Color.BLUE);
        g.fillRect(100, 100, 120,120);
        
        //draw the door
        g.setColor(Color.WHITE);
        g.fillRect(140, 160, 30,60);
        
        //draw sun
        g.setColor(Color.YELLOW);
        g.fillOval(240, 30, 50,50);
        
        //more clouds 
        g.setColor(Color.WHITE);
        g.fillOval(260, 50, 30, 30);
        g.fillOval(280, 50, 30, 30);
        g.fillOval(300, 50, 30, 30);
        g.fillOval(270, 40, 30, 30);
        g.fillOval(290, 40, 30, 30);
        
        //draw chimney
        g.setColor(Color.BLACK);
        g.fillRect(120, 55, 10,30);
        
        //C standard door black, roof magenta & 2 windows
         g.setColor(Color.BLACK);
         g.fillRect(145, 160, 30,60);
         g.setColor(Color.MAGENTA);
         g.fillPolygon(poly);
         //draw window 1
         g.setColor(Color.WHITE);
         g.fillRect(115, 125, 25,25);
         
          //draw window 1 cross bar
         g.setColor(Color.BLACK);
         g.drawLine(115, 137,140, 137);
         g.drawLine(127, 125,127, 150);
         
          //draw window 2
         g.setColor(Color.WHITE);
         g.fillRect(180, 125, 25,25);
         
          //draw window 2 cross bar
         g.setColor(Color.BLACK);
         g.drawLine(180, 137,205, 137);
         g.drawLine(192, 125,192, 150);
         
         //foundation
          
         g.setColor(Color.GREEN);
         g.fillRect(0, 200, 300,40);
         
         //draw tree
         g.setColor(Color.gray);
         g.fillRect(28, 100, 20,100);
         g.setColor(Color.GREEN);
         g.fillOval(0, 40, 80,80);
         
         
         //draw author label
         g.setColor(Color.BLACK);
         g.drawString("Trevor October's House", 150, 230);
         
    }
    
}
