
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class Event_Selector extends JFrame {
  JMenuBar menubar;
  JMenu File,EventType,adult;
  JMenuItem exit,child,birthday,anniversary,retirement,other;
  JLabel lblnorth,lblsouth;
  JRadioButton rdformal,rdcasual;
  ButtonGroup btngrp;
  JPanel north,center;
    public Event_Selector() {
     super("Event Selector"); 
     
     menubar=new JMenuBar();
     
     //Exit=new JMenu("File");
     File=new JMenu("File");
     EventType=new JMenu("Event Types");
     adult=new JMenu("Adult");
     
     exit=new JMenuItem("Exit");
     child=new JMenuItem("Child");
     birthday=new JMenuItem("Birthday");
     anniversary=new JMenuItem("Anniversary");
     retirement=new JMenuItem("Retirement");
     other=new JMenuItem("Other");
     
     lblnorth=new JLabel("Birthday events are our speciality");
     lblsouth=new JLabel("We have lots of ideas for memorable events");
     
     rdformal=new JRadioButton("Formal events",true);
     rdcasual=new JRadioButton("Casual events");
     
     btngrp=new ButtonGroup();
     north=new JPanel();
     center=new JPanel();
     
     btngrp.add(rdformal);
     btngrp.add(rdcasual);
     
     menubar.setLayout(new BorderLayout()); 
     menubar.add(File);
     menubar.add(EventType);
 
     File.add(exit);
     EventType.add(adult);
     EventType.add(child);
     menubar.setLayout(new FlowLayout(FlowLayout.LEFT));
     adult.add(birthday);
     adult.add(anniversary);
     adult.add(retirement);
     adult.add(other);
     
     //north.setLayout(new BorderLayout());
     north.add(lblnorth);
    north.setLayout(new FlowLayout(FlowLayout.CENTER));
     
     center.setLayout(new BorderLayout());
     center.add(north);
     center.add(lblsouth);
     center.add(rdformal);
     center.add(rdcasual);
     center.setLayout(new FlowLayout(FlowLayout.CENTER));
     
     add(menubar,BorderLayout.NORTH);
    // add(north,BorderLayout.CENTER);
     add(center,BorderLayout.CENTER);
     
     Handler handle=new Handler();
     exit.addActionListener(handle);
     birthday.addActionListener(handle);
     anniversary.addActionListener(handle);
     retirement.addActionListener(handle);
     other.addActionListener(handle);
     
     rdformal.addItemListener(handle);
     rdcasual.addItemListener(handle);
     
    }
 private class Handler implements ActionListener,ItemListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            
        }
     
 } 
}
