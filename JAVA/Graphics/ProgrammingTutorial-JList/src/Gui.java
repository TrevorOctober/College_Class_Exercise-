
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class Gui extends JFrame{
 
    JList list;
    
    String names []={"Black","Blue","Gray"};
    Color colors []={Color.BLACK,Color.blue, Color.GRAY};
    
    Gui(){
    super("The Title");
    
    setLayout(new FlowLayout());
    list=new JList(names);
    list.setVisibleRowCount(3);
    list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    add(new JScrollPane(list));
    
    list.addListSelectionListener(
            
            new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                
                getContentPane().setBackground(colors[list.getSelectedIndex()]);
            }
        }
            
            );
    
    }
}
