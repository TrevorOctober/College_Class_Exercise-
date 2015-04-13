/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package greeting;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author TREVOR OCTOBER
 */
public class Gui extends JFrame implements ActionListener  {
 JButton btngreet,btnreset;
 JTextField txtName,txtMidName,txtLName;
 JLabel lblName,lblMidName,lblLName;
 JPanel center,south;

    public Gui() throws HeadlessException {
        super("Greeting");
        
     btngreet=new JButton("Greet");   
     btnreset=new JButton("Reset");
     
     txtName=new JTextField(10);
     txtMidName=new JTextField(10);
     txtLName=new JTextField(10);
     
     lblName=new JLabel("Name:");
     lblMidName=new JLabel("MidName:");
     lblLName=new JLabel("Last Name:");
     
     center=new JPanel();
     center.setBackground(Color.LIGHT_GRAY);
     south=new JPanel();
     south.setBackground(Color.GREEN);
     
     center.add(lblName);
     center.add(txtName);
     center.add(lblMidName);
     center.add(txtMidName);
     center.add(lblLName);
     center.add(txtLName);
     center.setLayout(new GridLayout(3,2));
    
     south.add(btngreet);
     south.add(btnreset);
     
     this.setLayout(new BorderLayout());
     add(center,BorderLayout.CENTER);
     add(south,BorderLayout.SOUTH);
     
     btngreet.addActionListener(this);
     btnreset.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource()==btngreet)
          
        JOptionPane.showMessageDialog(this,txtName.getText().substring(0, 1)+
                txtMidName.getText().substring(0, 1)+" "+txtName.getText());
      else {
          txtName.setText(" ");
          txtMidName.setText(" ");
          txtLName.setText(" ");
          
      }
        
    }
 
    
}