package showcolors2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class ShowColors2JFrame extends JFrame {
private JButton changeColorJButton;
private Color color = Color.LIGHT_GRAY;
private JPanel colorJPanel;

public ShowColors2JFrame() {
super( "TREVOR GRAPHICS");    
        
colorJPanel = new JPanel();
add( colorJPanel, BorderLayout.CENTER );
colorJPanel.setBackground( color );  

changeColorJButton = new JButton( "Change Color" );
add( changeColorJButton, BorderLayout.SOUTH );
changeColorJButton.addActionListener(

new ActionListener() {

            @Override
 public void actionPerformed( ActionEvent event ){
 color = JColorChooser.showDialog(ShowColors2JFrame.this, "Choose a color", color );

  if ( color == null )
 color = Color.LIGHT_GRAY;

  colorJPanel.setBackground( color );
} // end method actionPerformed
 } // end anonymous inner class
 ); // end call to addActionListener 

 setSize( 400, 130 ); 
 setVisible( true );
 } 
 } 