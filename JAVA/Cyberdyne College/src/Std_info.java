import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.sql.*;

public class Std_info implements ActionListener {
   static String url="jdbc:mysql://localhost:3308/trevor";
    Connection conn=null;
    Statement st=null;
    ResultSet res=null;
    
    JButton btnView,btnBack,btnExit;
    JTextArea view;
    JPanel mypanel;

    public Std_info() {
      Gui();
      Connect();
      SelectData();
        
    }

    private void Gui() {
      JFrame mainwindow=new JFrame();
      mainwindow.setTitle("Student information Data Grid View");
      mainwindow.setSize(500, 450);
      mainwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      btnView=new JButton("Click to view Registered Student");
      btnBack=new JButton("<<<Back to Registration Form");
      btnExit=new JButton("Exit");
      
      view=new JTextArea(20,30);
      
       mypanel=new JPanel();
       mypanel.setLayout(new FlowLayout(FlowLayout.CENTER));
       mypanel.add(btnView);
       mypanel.add(view);
       mypanel.add(btnBack);
       mypanel.add(btnExit);
       
       btnBack.addActionListener(this);
       btnExit.addActionListener(this);
       btnView.addActionListener(this);
       
       mainwindow.add(mypanel);
       mainwindow.setVisible(true);
    }

    private void Connect() {
        try{
            conn=DriverManager.getConnection(url, "root", "12345");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    private void SelectData() {
        try{
           st=conn.createStatement();
           String sql="SELECT * FROM cyberdyne_college";
           res=st.executeQuery(sql);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        Object src=e.getSource();
        if(btnView==src)
        {JbtnView();}
        if(btnBack==src)
        {JbtnBack();}
        if(btnExit==src)
        {JbtnExit();}    
    }

    private void JbtnView() {
     try{
         int count=0;
         String store="";
         String response="";
         
         while(res.next()){
             count++;
             store = store + "\n" + count + ". "+
                        res.getString("std_full_name") + " || " +
                        res.getString("std_surname") + " || " +
                        res.getString("Id_num") + " || " +
                        res.getString("course_name") + " || " +
                        res.getString("contact_num");
             response ="Number of Records: " + count + store;
             view.setText(response);
         }
         
     }catch(Exception ex){
         ex.printStackTrace();
     }  
    }

    private void JbtnBack() {
      Std_Reg go = new Std_Reg();  
    }

    private void JbtnExit() {
        System.exit(1);
    }
}
