package jinsurance;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Insurance extends JFrame implements ItemListener {
  JLabel CampanyNamelabel;
  JCheckBox HMOchkBox,PPOchkBox,DentalInsurancechkBox,VisionInsurancechkBox;
  JTextField OutputTextbox;
  ButtonGroup btnGroup;
  JPanel north,center,south;
  double Amount;
    public Insurance() {
       
     CampanyNamelabel=new JLabel("JInsurance");
     
     HMOchkBox=new JCheckBox("HOM");
     PPOchkBox=new JCheckBox("PPO");
     DentalInsurancechkBox=new JCheckBox("Dental Insurance");
     VisionInsurancechkBox=new JCheckBox("Vision Insurance");
     
     OutputTextbox=new JTextField(20);
     
     btnGroup=new ButtonGroup();
     
     north=new JPanel();
     center=new JPanel();
     south=new JPanel();
     
     north.setLayout(new BorderLayout());
     north.add(CampanyNamelabel);
     
     north.setLayout(new FlowLayout(FlowLayout.CENTER));
     
     center.setLayout(new BorderLayout());
     center.add(HMOchkBox);
     center.add(DentalInsurancechkBox);
     center.add(PPOchkBox);
     center.add(VisionInsurancechkBox);
     center.setLayout(new GridLayout(2,2));
     
     btnGroup.add(HMOchkBox);
     btnGroup.add(PPOchkBox);
     
     south.setLayout(new BorderLayout());
     south.add(OutputTextbox);
     
     south.setLayout(new FlowLayout(FlowLayout.CENTER));
     
     add(north, BorderLayout.NORTH);
     add(center, BorderLayout.CENTER);
     add(south, BorderLayout.SOUTH);
     
     HMOchkBox.addItemListener(this);
     PPOchkBox.addItemListener(this);
     DentalInsurancechkBox.addItemListener(this);
     VisionInsurancechkBox.addItemListener(this);
     
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
      Amount=0.0;
       if(e.getSource()==HMOchkBox){
           Amount=Amount+200;
       OutputTextbox.setText("HMO "+Amount);
       }
       if (e.getSource()==PPOchkBox){
       Amount=Amount+600;
       OutputTextbox.setText("PPO "+Amount);
        }
       if (DentalInsurancechkBox.isSelected()==true){
           Amount=Amount+75;
       OutputTextbox.setText(""+Amount);
       }
       else if(DentalInsurancechkBox.isSelected()==false){
          OutputTextbox.setText("");  
       }
       if (VisionInsurancechkBox.isSelected()==true){
           Amount=Amount+20;
       OutputTextbox.setText(""+Amount);
       }
      else if (VisionInsurancechkBox.isSelected()==false){
       OutputTextbox.setText("");
        }
              
    }
    
        }
            
        
        
        
    
  

