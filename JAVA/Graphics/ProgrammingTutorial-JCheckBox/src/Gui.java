
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Gui extends JFrame{
 
  JTextField txtOutput;
  JCheckBox ChkBold,ChkItalic;
  
  Gui(){
   super("The Title") ;
   
   txtOutput=new JTextField("hi, My Name is Trevor", 20);
   txtOutput.setFont(new  Font("Serif", Font.PLAIN, 14));
   
   ChkBold=new JCheckBox("Bold");
   ChkItalic=new JCheckBox("Italic");
   
   
   setLayout(new FlowLayout());
   
   add(txtOutput);
   add(ChkBold);
   add(ChkItalic);
   
   HandlerClass handler=new HandlerClass();
   ChkBold.addItemListener(handler);
   ChkItalic.addItemListener(handler);  
  }
  private class HandlerClass implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
         Font font=null;
            
         if (ChkBold.isSelected() && ChkItalic.isSelected())
          font=new Font("Serif", Font.BOLD+Font.ITALIC,14);   
         else if(ChkBold.isSelected())
             font=new Font("Serif", Font.BOLD,14);
         else if(ChkItalic.isSelected())
             font=new Font("Serif", Font.ITALIC,14);
         else
             font=new Font("Serif",Font.PLAIN,14);
         txtOutput.setFont(font);
        }
      
  } 
  
}
