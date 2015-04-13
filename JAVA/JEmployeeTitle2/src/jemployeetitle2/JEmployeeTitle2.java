
package jemployeetitle2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JEmployeeTitle2 extends JApplet implements ActionListener {

    JLabel JobTitleLabel,EmpNameLabel;
    JTextField JobTitleTextBox,EmpNameTextBox;
    JButton DisplayButton;
    JPanel centerPanel,southPanel;
    
    public void init(){
     
    JobTitleLabel=new JLabel("JOB TITLE");
    EmpNameLabel=new JLabel("EmpNAME");
    
    JobTitleTextBox=new JTextField(10);
    EmpNameTextBox=new JTextField(10);
   
    DisplayButton=new JButton("Display");
   
    centerPanel=new JPanel();
    southPanel=new JPanel();
        
    centerPanel.setLayout(new BorderLayout());
    centerPanel.add(JobTitleLabel);
    centerPanel.add(JobTitleTextBox);
    centerPanel.add(EmpNameLabel);
    centerPanel.add(EmpNameTextBox);
    centerPanel.setLayout(new GridLayout(2,1));
    
    southPanel.setLayout(new BorderLayout());
    southPanel.add(DisplayButton);
    
    southPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
    
    add(centerPanel, BorderLayout.CENTER);
    add(southPanel, BorderLayout.SOUTH);
    
    
   DisplayButton.addActionListener(this);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getSource()==DisplayButton);
        
    String[] JobTitle = {"WebDeveloper", "Analysis", "CEO_FB", "Admin", "Java Lecture"};
    String[] EmpName = {"Thami", "Cendric", "Mark", "zee", "Sphiwe"};
    String job = JobTitleTextBox.getText();
    String name = EmpNameTextBox.getText();
   for(int x = 1; x <EmpName.length; x++)     
    {
     if(job.equals(JobTitle[x]));{
     JobTitleTextBox.setText(JobTitle[x]);
     }
     if(name.equals(EmpName[x]));
        {
     EmpNameTextBox.setText(EmpName[x]);
        }   
    }
    
     invalidate();
     validate();
    
        }  
    }
   
        
    
   

        
    
    
    
    

