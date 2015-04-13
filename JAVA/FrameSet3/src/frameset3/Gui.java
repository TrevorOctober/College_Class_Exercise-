
package frameset3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author TREVOR OCTOBER
 */
public class Gui extends JFrame implements ItemListener {
 JRadioButton jrbBlack=new JRadioButton("BLACK",true);
 JRadioButton jrbGreen=new JRadioButton("GREEN");
 JRadioButton jrbRed=new JRadioButton("RED");
 
 ButtonGroup GroupBtn=new ButtonGroup();
 JPanel jrbPanel=new JPanel();
 JPanel Display=new JPanel();

    public Gui() throws HeadlessException {
        super("Black Green Red");
        
        jrbGreen.setLayout(new BorderLayout());
        jrbPanel.add(jrbBlack);
        jrbPanel.add(jrbGreen);
        jrbPanel.add(jrbRed);
        jrbGreen.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        //GroupButton
        GroupBtn.add(jrbBlack);
        jrbBlack.setBackground(Color.BLACK);
        GroupBtn.add(jrbGreen);
        jrbGreen.setBackground(Color.GREEN);
        GroupBtn.add(jrbRed);
        jrbRed.setBackground(Color.red);
        
        Display.setLayout(new BorderLayout());
        Display.setBackground(Color.GRAY);
       
        add(jrbPanel, BorderLayout.NORTH);
        add(Display, BorderLayout.CENTER);
       
        jrbBlack.addItemListener(this);
        jrbGreen.addItemListener(this);
        jrbRed.addItemListener(this);
       
       
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
     
        if(jrbBlack.isSelected())
        Display.setBackground(Color.BLACK);
        
        else if (jrbGreen.isSelected())
            Display.setBackground(Color.GREEN);
        else if (jrbRed.isSelected())
            Display.setBackground(Color.red);
        
    }
 
}
