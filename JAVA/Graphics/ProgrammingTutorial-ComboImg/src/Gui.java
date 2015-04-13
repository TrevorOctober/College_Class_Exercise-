
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Gui extends JFrame {
   
    JComboBox cmbBox;
    JLabel lblPicture;
    
    
    String filename []={"t.jpg","p.jpg"};
    Icon img []={new ImageIcon(getClass().getResource(filename[0])), new ImageIcon(getClass().getResource(filename[1]))};
    
    Gui(){
    super("The Title") ;   
    setLayout(new FlowLayout()); 
    
    cmbBox=new JComboBox(filename);
    lblPicture=new JLabel(img[0]);
    
    add(cmbBox);
    add(lblPicture);
    
    cmbBox.addItemListener(
            
            new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==ItemEvent.SELECTED)
                    
                   lblPicture.setIcon(img[cmbBox.getSelectedIndex()]);
            }
        }  
            );
    
        
    }
}
