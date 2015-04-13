
package ntu2kofashionstore;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Gui extends JFrame {
JLabel lblLogo=new JLabel("NTU2KO FASHION STORE");
JLabel lblTotal=new JLabel("TOTAL");

JCheckBox chbTshirt=new JCheckBox("TSHIRT.R100");
JCheckBox chbShoes=new JCheckBox("SHOES.R50");

JRadioButton rdbCash=new JRadioButton("CASH");
JRadioButton rdbCard=new JRadioButton("CARD 10%");


JTextField txtOutput=new JTextField(10);

JPanel myPanel1=new JPanel();
JPanel myPanel2=new JPanel();
JPanel myPanel3=new JPanel();

ButtonGroup Group=new ButtonGroup();
double amount;
    // double interest=0.10;
    public Gui() throws HeadlessException {
        super("Ntu2ko Fashion Store");
        
        
        myPanel1.setLayout(new BorderLayout());
        myPanel1.add(lblLogo);
        myPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        myPanel1.setBackground(Color.GRAY);
        
        myPanel2.setLayout(new BorderLayout());
        myPanel2.add(chbTshirt);
        myPanel2.add(chbShoes);
        myPanel2.add(rdbCash);
        myPanel2.add(rdbCard);
        myPanel2.setLayout(new GridLayout(2,2));
        myPanel2.setBackground(Color.GREEN);
        
        myPanel3.setLayout(new BorderLayout());
        myPanel3.add(lblTotal);
        myPanel3.add(txtOutput);
        myPanel3.setLayout(new FlowLayout(FlowLayout.CENTER));
        myPanel3.setBackground(Color.RED);
        
        Group.add(rdbCash);
        Group.add(rdbCard);
        
        
        add(myPanel1, BorderLayout.NORTH);
        add(myPanel2, BorderLayout.CENTER);
        add(myPanel3, BorderLayout.SOUTH);
        
        Handler handle=new Handler();
        chbTshirt.addItemListener(handle);
        chbShoes.addItemListener(handle);
        rdbCash.addItemListener(handle);
        rdbCard.addItemListener(handle); 
    }
private class Handler implements ItemListener{
    
        @Override
    public void itemStateChanged(ItemEvent evt){
        amount=0.0;
        if(chbTshirt.isSelected()==true)
          amount=amount+100.0;
        if(chbShoes.isSelected()==true)
            amount=amount+50.0;
        if(evt.getSource()==rdbCash)
            txtOutput.setText("R" +amount+"0");
        else{
            amount=(amount+(amount*0.1));
            txtOutput.setText("R" +amount+"0");
            
        }
        
      
            
       
            
    }
}
}
