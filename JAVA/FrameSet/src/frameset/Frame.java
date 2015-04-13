
package frameset;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author TREVOR OCTOBER
 */
public class Frame extends JFrame{
  JButton btnRed=new JButton("RED");
  JButton btnBlue=new JButton("BLUE");
  JButton btnGreen=new JButton("GREEN");
  
  JCheckBox checkRed=new JCheckBox("RED");
  JCheckBox checkBlue=new JCheckBox("BLUE");
  JCheckBox checkGreen=new JCheckBox("GREEN"); 
  
  JPanel BtnPanel=new JPanel();
  JPanel CheckBoxPanel=new JPanel();

    public Frame(){
        
     
     BtnPanel.setLayout(new BorderLayout());
     BtnPanel.add(btnRed);
     btnRed.setBackground(Color.red);
     BtnPanel.add(btnBlue);
     btnBlue.setBackground(Color.BLUE);
     BtnPanel.add(btnGreen);
     btnGreen.setBackground(Color.GREEN);
     BtnPanel.setBackground(Color.BLACK);
     BtnPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
     
    CheckBoxPanel.setLayout(new BorderLayout());
     
    CheckBoxPanel.add(checkRed);
    checkRed.setBackground(Color.red);
    CheckBoxPanel.add(checkBlue);
    checkBlue.setBackground(Color.BLUE);
    CheckBoxPanel.add(checkGreen);
    checkGreen.setBackground(Color.GREEN);
    CheckBoxPanel.setLayout(new GridLayout(3,1));
     
     this.add(BtnPanel,BorderLayout.NORTH);
     this.add(CheckBoxPanel,BorderLayout.WEST);
    }
}
