
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Gui extends JFrame{
 
    JButton btnreg;
    JButton btnCustom;

    public Gui(){
     super("The Title");
     
     setLayout(new FlowLayout(FlowLayout.CENTER)); 
     btnreg=new JButton("Reg");
    
        
     add(btnreg);
     Icon b=new ImageIcon(getClass().getResource("b.jpg")); 
     Icon m=new ImageIcon(getClass().getResource("m.jpg"));
     
      btnCustom=new JButton("Custom", b);
      btnCustom.setRolloverIcon(m);
     add(btnCustom);
     
     HandlerClass handler=new HandlerClass();
     btnreg.addActionListener(handler);
     btnCustom.addActionListener(handler);   
    }
    private class HandlerClass implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
         
           // JOptionPane.showMessageDialog(null, String.format("%s", Event.ACTION_EVENT));
        }
        
    } 
    
}
