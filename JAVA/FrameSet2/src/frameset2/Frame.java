
package frameset2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Frame extends JFrame implements ActionListener{
   JButton btnRed=new JButton("RED");
   JButton btnOrange=new JButton("ORANGE");
   JButton btnPink=new JButton("PINK");
   
   JPanel btnPanel=new JPanel();
   JPanel displayPanel=new JPanel();

    public Frame() throws HeadlessException{
        
   btnPanel.setLayout(new BorderLayout());
   btnPanel.add(btnRed);
   btnPanel.add(btnOrange);
   btnPanel.add(btnPink);
   btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER));     
   
   displayPanel.setLayout(new BorderLayout());
   displayPanel.setBackground(Color.BLACK);
   displayPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
   
   add(btnPanel,BorderLayout.NORTH);
   add(displayPanel,BorderLayout.CENTER);
   
   btnRed.addActionListener(this);
   btnOrange.addActionListener(this);
   btnPink.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnRed)
        displayPanel.setBackground(Color.red); 
        else if (e.getSource()==btnOrange)
        displayPanel.setBackground(Color.ORANGE);
        else if (e.getSource()==btnPink)
        displayPanel.setBackground(Color.PINK); 
         
    }
   
}
