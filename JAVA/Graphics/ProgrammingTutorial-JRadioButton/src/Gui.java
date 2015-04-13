
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.security.acl.Group;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Gui extends JFrame{
Font fp,fb,fi,fbi;    
JTextField txtOutput;
JRadioButton rdPlain,rdBold,rdItalic,rdBold_Italic;
ButtonGroup grp;

Gui(){
super("The Title");
setLayout(new FlowLayout());

txtOutput=new JTextField("Peal is awesome and Hot", 25);
//txtOutput.setFont(new Font("SERIF", Font.CENTER_BASELINE,14));


rdPlain=new JRadioButton("Plain", true);
rdBold=new JRadioButton("Bold",false);
rdItalic=new JRadioButton("Italic",false);
rdBold_Italic=new JRadioButton("Bold & Italic", false);

add(txtOutput);
add(rdPlain);
add(rdBold);
add(rdItalic);
add(rdBold_Italic);


grp=new ButtonGroup();
grp.add(rdPlain);
grp.add(rdBold);
grp.add(rdItalic);
grp.add(rdBold_Italic);

fp=new Font("Serif", Font.PLAIN,14);
fb=new Font("Serif", Font.BOLD,14);
fi=new Font("Serif", Font.ITALIC,14);
fbi=new Font("Serif", Font.BOLD + Font.ITALIC,14);
txtOutput.setFont(fp);

rdPlain.addItemListener(new HandlerClass(fp));
rdBold.addItemListener(new HandlerClass(fb));
rdItalic.addItemListener(new HandlerClass(fi));
rdBold_Italic.addItemListener(new HandlerClass(fbi));

}
private class HandlerClass implements ItemListener{
    
    Font font;
    //the font object get variable font
   public HandlerClass(Font f){
        font=f; 
    }

        @Override
        public void itemStateChanged(ItemEvent e) {
           
            txtOutput.setFont(font);
        }
    }
    
}
