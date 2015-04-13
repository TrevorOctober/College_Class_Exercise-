/*
 ij `nrj = new ij(); * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package comboboxdemo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Gui extends JFrame  {

JPanel centerPanel; 
JLabel lblSL,lblTL,lblTP;
JTextField txtPrice;
JComboBox SizeList;
JComboBox ToppingList;
double price ;
String[] size = { "Small", "Medium", "Large", "Extra-Large"};
String []topping={"Cheese","Anchovies","Chill Sauce","Sausages","Pepperoni"};
   
public Gui() {
    super("ComboBoxDemo");   
  SizeList = new JComboBox(size); 
  ToppingList=new JComboBox(topping);
   
  lblSL=new JLabel("Size List");
  lblTL=new JLabel("Topping List");
  lblTP=new JLabel("Total Price");

  txtPrice=new JTextField(10);
  
  centerPanel=new JPanel();
  
  centerPanel.setLayout(new BorderLayout());
  centerPanel.add(lblSL);
  centerPanel.add(SizeList);
  centerPanel.add(lblTL);
  centerPanel.add(ToppingList);
  centerPanel.add(lblTP);
  centerPanel.add(txtPrice);
  centerPanel.setLayout(new GridLayout(3,3));
  
  add(centerPanel,BorderLayout.CENTER);
  
  Handler Handle=new Handler();
  SizeList.addItemListener(Handle);
  ToppingList.addItemListener(Handle);
  
    } 
private class Handler implements ItemListener{
        @Override
   public void itemStateChanged(ItemEvent e){
   price=0.0;
        if(SizeList.getSelectedIndex()==0){
        price=15.0;
        txtPrice.setText(ToppingList.getSelectedItem()+"R"+price);
    }
        else if (SizeList.getSelectedIndex()==1){
                price=30.0;
                txtPrice.setText(ToppingList.getSelectedItem()+"R"+price);
   }
        else if (SizeList.getSelectedIndex()==2){
            price=45.0;
            txtPrice.setText(ToppingList.getSelectedItem()+"R"+price);
        }
        else if (SizeList.getSelectedIndex()==3)
            price=60.0;
            txtPrice.setText(ToppingList.getSelectedItem()+"R"+price);
   } 
}
    

}
