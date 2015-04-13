
import javax.swing.JFrame;



public class Tutorial{
    
   public static void main (String args []){
    
       Gui go=new Gui();
       go.setSize(350, 350);
      
       go.setAlwaysOnTop(true);
      
       go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       go.setVisible(true);
   }  
}
