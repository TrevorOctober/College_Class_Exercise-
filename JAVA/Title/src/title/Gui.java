
package title;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
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


public class Gui extends JFrame {
  JLabel lblName,lblMidname,lblLastname;
  JTextField txtName,txtMidname,txtLastname;
  JButton btnDisplay;
  JPanel northPanel,centerPanel;

    public Gui()  {
    super("Title");
    
    lblName=new JLabel("Name");
    lblMidname=new JLabel("Midname");
    lblLastname=new JLabel("Lastname");
    
    txtName=new JTextField(10);
    txtMidname=new JTextField(10);
    txtLastname=new JTextField(10);
    
    btnDisplay=new JButton("Display");
    northPanel=new JPanel();
    //centerPanel=new JPanel();
    
    northPanel.setLayout(new BorderLayout());
    northPanel.setBackground(Color.GREEN);
    northPanel.add(lblName);
    northPanel.add(txtName);
    northPanel.add(lblMidname);
    northPanel.add(txtMidname);
    northPanel.add(lblLastname);
    northPanel.add(txtLastname);
    northPanel.setLayout(new GridLayout(3,3));
                                                
    btnDisplay.setLayout(new BorderLayout());
    add(btnDisplay);
   // btnDisplay.setLayout(new FlowLayout(FlowLayout.CENTER));
     
    add(northPanel, BorderLayout.NORTH);
    add(btnDisplay, BorderLayout.CENTER);
    
    Handler Handle=new Handler();
    btnDisplay.addActionListener(Handle);
    }
  private class Handler implements ActionListener{
  
      public void actionPerformed(ActionEvent e){
        
      if (e.getSource()==btnDisplay)
          JOptionPane.showMessageDialog(null,"Welcome " + txtName.getText().substring(0, 1)+ txtMidname.getText().substring(0, 1)+ " "+ txtLastname.getText());
      
      }
    
  }}
