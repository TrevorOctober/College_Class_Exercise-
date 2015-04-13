
import java.awt.HeadlessException;
import javax.swing.*;


public class Demo_TP extends JFrame{
 
    JPanel firstpanel=new JPanel();
    JPanel secondpanel=new JPanel();
    
    JLabel firstLabel=new JLabel("First Label");
    JLabel secondLabel=new JLabel("Second Label");
    
    JTabbedPane tabbedpane=new JTabbedPane();

    public Demo_TP() {
    
    firstpanel.add(firstLabel);
    secondpanel.add(secondLabel);
     
    tabbedpane.add("First Pane",firstpanel);
    tabbedpane.add("Second panel",secondpanel);
    add(tabbedpane);
    }
    
    
    
    public static void main (String args[]){
     Demo_TP go=new Demo_TP();
     go.setTitle("Demo TabbedPane");
     go.setSize(250, 250);
     
     go.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     go.setVisible(true);   
    }
}
