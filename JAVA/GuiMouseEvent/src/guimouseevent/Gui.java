
package guimouseevent;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JFrame {
 private JPanel mousepanel=new JPanel();
 private JLabel statusbar=new JLabel("default");;

    public Gui() {
     super("title");
    
     mousepanel.setBackground(Color.white);
     add(mousepanel,BorderLayout.CENTER);
     
   
     add(statusbar,BorderLayout.SOUTH);
     
     Handlerclass handler=new Handlerclass();
     mousepanel.addMouseListener(handler);
     mousepanel.addMouseMotionListener(handler);
       
    }
 private class Handlerclass implements MouseListener,MouseMotionListener{
        @Override
     public void mouseClicked(MouseEvent event){
     statusbar.setText(String.format("Clicked at %d,%d", event.getX(),event.getY()));    
     }
        @Override
     public void mousePressed(MouseEvent event){
         statusbar.setText("you have pressed down the mouse");
     }
        @Override
     public void mouseReleased(MouseEvent event){
     statusbar.setText("you released the mouse");    
     }
        @Override
    public void mouseEntered(MouseEvent event){
     statusbar.setText("you you entered the area");
     mousepanel.setBackground(Color.BLACK);
     } 
        @Override
    public void mouseExited(MouseEvent event){
     statusbar.setText("the mouse has left the window");
     mousepanel.setBackground(Color.GRAY);
     
     }
        @Override
    public void mouseDragged(MouseEvent event){
     statusbar.setText("you are dragging the mouse");    
     }
        @Override
    public void mouseMoved(MouseEvent event){
     statusbar.setText("you moved the mouse");    
     }
 }
}
