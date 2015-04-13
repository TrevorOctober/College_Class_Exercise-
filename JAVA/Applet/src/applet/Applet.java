/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applet;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
public class Applet extends JApplet {
    /* JLabel lblStartX = new JLabel("Start X");
     JTextField StartXText = new JTextField(10);
     
     JLabel lblEndX = new JLabel("End X");   

     
     JTextField EndXText = new JTextField(10);
     JButton btnDrawShape = new JButton("Draw Shape");
    */
   
    @Override
    public void init () {
        
        JLabel lblStartX = new JLabel("Start X");
        JTextField StartXText = new JTextField(10);
        
        JLabel lblStartY = new JLabel("Start Y");
        JTextField StartYText = new JTextField(10);
        
        JLabel lblEndX = new JLabel("End X");
        JTextField EndXText = new JTextField(10);
        
        JLabel lblEndY = new JLabel("End Y");
        JTextField EndYText = new JTextField(10);
        
        
        
        
        JButton btnDrawShape = new JButton("Draw Shape");
        
         JPanel north=new JPanel();
         north.setSize(100, 200);
        
         
         //setLayout(new BorderLayout());
         north.add(lblStartX);
         north.add(StartXText);
         
         north.add(lblStartY);
         north.add(StartYText);
         
         north.add(lblEndX);
         north.add(EndXText);
         
         north.add(lblEndY);
         north.add(EndYText);
         
         north.add(btnDrawShape);
         
         setLayout(new BorderLayout());
        
        getContentPane().add(north,BorderLayout.CENTER);
       
       
     
     
     
     
     


        
        
    }
}
