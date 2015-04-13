/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package age;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Gui extends JFrame implements ActionListener {
 JLabel lblDob=new JLabel("DOB:");
 JLabel lblCy=new JLabel("Current Year:");
 JLabel lblAge=new JLabel("Age:");
 
 JButton btnBirthDate=new JButton("Birth Date");
 
 JRadioButton rdMale=new JRadioButton("Male", true);
 JRadioButton rdFemale=new JRadioButton("Female");
 
 JTextField txtCy=new JTextField(10);
 JTextField txtDob=new JTextField(10);
 JTextField txtAge=new JTextField(10);
 
 JPanel myPanel1=new JPanel();
 JPanel myPanel2=new JPanel();
 String cy,dob;
int age,cy2,dob2;
 public Gui() throws HeadlessException {
        super("Gender");
  myPanel1.setLayout(new BorderLayout());
  myPanel1.setBackground(Color.red);
  myPanel1.add(lblCy);
  myPanel1.add(txtCy);
  myPanel1.add(lblDob);
  myPanel1.add(txtDob); 
  myPanel1.add(lblAge);
  myPanel1.add(txtAge);
  myPanel1.setLayout(new GridLayout(3,3));
  
  myPanel2.setLayout(new BorderLayout());
  myPanel2.setBackground(Color.BLACK);
  myPanel2.add(btnBirthDate);
  myPanel2.setLayout(new FlowLayout(FlowLayout.CENTER));
  
  add(myPanel1, BorderLayout.NORTH);
  add(myPanel2, BorderLayout.CENTER);
 
  btnBirthDate.addActionListener(this);
  
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      cy=txtCy.getText();
      dob=txtDob.getText();
      
      cy2=Integer.parseInt(cy);
      dob2=Integer.parseInt(dob);
      
      age=cy2-dob2;
      if(e.getSource()==btnBirthDate)
          txtAge.setText("" +age);
     
    }
        
}
