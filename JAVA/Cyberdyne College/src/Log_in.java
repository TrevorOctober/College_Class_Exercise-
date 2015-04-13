import java.awt.Event.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import java.sql.*;
        
public class Log_in implements ActionListener{
static String url="jdbc:mysql://localhost:3308/trevor";
    Connection conn=null;
    Statement st=null;
    ResultSet res=null;

    JLabel lblUsername,lblPass;
    JTextField txtUsername;
    JPasswordField txtPass;
    JButton btnLogin,btnCancel;
    JPanel mypanel;
    
    public static void main(String []args){
        
        new Log_in();
    }
    public Log_in(){
        Gui();
        Connect();
       // SelectData();
}

    private void Gui() {
        JFrame mainwindow=new JFrame();
        mainwindow.setTitle("Cyberdyne College");
        mainwindow.setSize(450, 200);
        mainwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblUsername=new JLabel("User Name: ");
        lblPass=new JLabel("Login Password: ");
        
        txtUsername=new JTextField(10);
        txtPass=new JPasswordField(10);
        
        btnLogin=new JButton("Login");
        btnCancel=new JButton("Cancel");
        
        mypanel=new JPanel();
        
        mypanel.setLayout(new GridLayout(3,2));
        mypanel.add(lblUsername);
        mypanel.add(txtUsername);
        mypanel.add(lblPass);
        mypanel.add(txtPass);
        mypanel.add(btnLogin);
        mypanel.add(btnCancel);
        
        btnLogin.addActionListener(this);
        btnCancel.addActionListener(this);
        
        mainwindow.add(mypanel);
        mainwindow.setVisible(true);
    }

    private void Connect() {
        try{
          conn =DriverManager.getConnection(url, "root", "12345");
        }catch(Exception ex){
            System.out.println("Not Connected");
            ex.getMessage();
        }
    }

  /* private void SelectData() {
        try{
           
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
       Object src=e.getSource();
       
       if(btnLogin ==src)
       {LOGIN();}
       if(btnCancel == src)
       {CANCEL();}    
    }

    public void LOGIN() {
        
                 /*  try{
           String user =txtUsername.getText().trim();
           String pass =txtPass.getText().trim();
            
            String sql="SELECT User_name,Password FROM admin WHERE User_name='"+user+"'AND Password='"+pass+"'";
            res=st.executeQuery(sql);
            
            int count = 0;
            while(res.next())
            {
            count = count + 1;
     }
     if(count == 1)
     {
         JOptionPane.showMessageDialog(null, "User Found,Access Granted!");
     }
     else if(count > 1){
         JOptionPane.showMessageDialog(null, "Duplicate User, Access Denied!");
     }
     else{
         JOptionPane.showMessageDialog(null, "User not Found!");
     }
               
           }catch(Exception ex){
               ex.printStackTrace();
           }  
       }*/
       
       Std_Reg go = new Std_Reg();
        
    }
    

    private void CANCEL() {
       System.exit(1); 
    }
}
    
