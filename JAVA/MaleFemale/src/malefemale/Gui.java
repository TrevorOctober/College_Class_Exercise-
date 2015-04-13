/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package malefemale;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Gui extends JFrame {
 JLabel lblTitle=new JLabel("Male Female");
 JLabel lblOutput=new JLabel("Gender");
 
 JRadioButton rbMale=new JRadioButton("Male", true);
 JRadioButton rbFamale=new JRadioButton("Female");
 
 JTextField txtOutput=new JTextField(20);
 
 ButtonGroup group=new ButtonGroup();
 
 JPanel mypanel1=new JPanel();
 JPanel mypanel2=new JPanel();
 JPanel mypanel3=new JPanel();

    public Gui() throws HeadlessException {
        super("Male famale");
       txtOutput.setForeground(Color.red); 
       mypanel1.setLayout(new BorderLayout());
       mypanel1.add(lblTitle);
       mypanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
       
       mypanel2.setLayout(new BorderLayout());
       mypanel2.add(rbMale);
       mypanel2.add(rbFamale);
       mypanel2.setLayout(new FlowLayout(FlowLayout.CENTER));
       
       group.add(rbMale);
       group.add(rbFamale);
       
       mypanel3.setLayout(new BorderLayout());
       mypanel3.add(lblOutput);
       mypanel3.add(txtOutput);
       mypanel3.setLayout(new FlowLayout(FlowLayout.CENTER));
       
       add(mypanel1,BorderLayout.NORTH);
       add(mypanel2,BorderLayout.CENTER);
       add(mypanel3,BorderLayout.SOUTH);
       
       
       
       
       Handler handle=new Handler();
       rbMale.addItemListener(handle);
       rbFamale.addItemListener(handle);
    }
 private class Handler implements ItemListener{
        @Override
    public void itemStateChanged(ItemEvent evt){
      
      if (rbMale.isSelected()==true)
          txtOutput.setText("You hv selected Male");
      else if (rbFamale.isSelected()==true)
          txtOutput.setText("You hv selected Female");
        
    } 
 }
}
