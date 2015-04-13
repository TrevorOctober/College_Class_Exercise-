
package mymachine;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyMachine implements ActionListener {
JFrame Form;
JButton btnLocalHost,btnByName;
JPanel center;

InetAddress Lhost;
InetAddress ByName;

    public static void main(String[] args) throws UnknownHostException {
      new MyMachine();
    }
    public MyMachine() throws UnknownHostException{
     Gui();   
    // SelectData();
    }

    private void Gui() {
        Form=new JFrame();
        Form.setTitle("InetAddressIllustration");
        Form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Form.setSize(250, 250);
        
        btnByName=new JButton("GetByName");
        btnLocalHost=new JButton("GetByLocalHost");
        
        center=new JPanel();
        center.add(btnByName);
        center.add(btnLocalHost);
        center.setLayout(new GridLayout(2,0));
        
        
        Form.add(center);
        Form.setVisible(true);
        
        btnByName.addActionListener(this);
        btnLocalHost.addActionListener(this);  
    }
    @Override
    public void actionPerformed(ActionEvent e) {
     Object Source=e.getSource();
      if(Source==btnByName) 
          { try {
                btn_GetByName();
            } catch (UnknownHostException ex) {
                Logger.getLogger(MyMachine.class.getName()).log(Level.SEVERE, null, ex);
            }
}
       if(Source==btnLocalHost) 
          { try {
                btn_GetByLoacalHost();
            } catch (UnknownHostException ex) {
                Logger.getLogger(MyMachine.class.getName()).log(Level.SEVERE, null, ex);
            }
}     
    }
    private void btn_GetByName() throws UnknownHostException {
      InetAddress ByName= InetAddress.getByName("TREVOROCTOBER");
      System.out.println("Other host info is: "+ByName);  
    }

    private void btn_GetByLoacalHost() throws UnknownHostException {
       InetAddress Lhost= InetAddress.getLocalHost();
        System.out.println("This host info is: "+Lhost);
    }
} 
