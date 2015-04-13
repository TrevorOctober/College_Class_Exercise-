/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package applet;

import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/**
 *
 * @author TREVOR
 */
public class simple extends Applet {
    double num1, num2, sum;
    String number1, number2;
    public void init (){
      number1=JOptionPane.showInputDialog("Please enter the first number");  
      number2=JOptionPane.showInputDialog("Please enter the second number"); 
      num1 = Double.parseDouble(number1);
      num2 = Double.parseDouble(number2);
      sum = num1 + num2 ;
    }
   public void paint (Graphics g) {
       JOptionPane.showMessageDialog(this, "WOW");
       g.drawOval(10, 20, 100, 50);
       g.drawString("The sum is :"+sum,10, 25); 
       
   }
}
