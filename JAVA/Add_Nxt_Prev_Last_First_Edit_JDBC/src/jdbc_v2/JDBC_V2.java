/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_v2;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JDBC_V2 implements ActionListener{

 static String URL="jdbc:mysql://localhost:3308/database_prov1";
 Connection conn=null;
 Statement st=null;
 ResultSet res=null;
 
 JFrame MainWindow;
 
 JTextField txtID,txtName,txtQuantity,txtPrice;
 JLabel lblID,lblName,lblQuantity,lblPrice;
 JButton btnNext,btnPrev,btnLast,btnFirst,btnSave,btnUpdate;
 JPanel myPanel;
    
   public static void main(String[] args) {
       new JDBC_V2();
    }
public JDBC_V2(){
    Connect();
    SelectData();
    Gui();
    DisplayData();
}
public void Connect(){
    try{
    conn=DriverManager.getConnection(URL, "root", "1234");
   System.out.println("Connected");
    }
    catch(Exception ex)
    {
        System.out.println("Not Connected");
        System.out.println(ex);
    }
}

public void SelectData(){
    try{
     st=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
     res=st.executeQuery("SELECT*FROM inventory");
    }
    catch(Exception ex)
    {System.out.println(ex);}
}
public void Gui(){
 MainWindow=new JFrame();
 MainWindow.setTitle("Inventory");
 MainWindow.setSize(300, 200);
 MainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 myPanel=new JPanel();
 
 lblID=new JLabel("ID");
 lblName=new JLabel("Name");
 lblQuantity=new JLabel("Quantity");
 lblPrice=new JLabel("Price");
 
 txtID=new JTextField(10);
 txtName=new JTextField(10);
 txtQuantity=new JTextField(10);
 txtPrice=new JTextField(10);
 
 btnPrev=new JButton("Prev");
 btnNext=new JButton("Next");
 btnFirst=new JButton("First");
 btnLast=new JButton("Last");
 btnSave=new JButton("Save");
 btnUpdate=new JButton("Update");
 
 myPanel.add(lblID);
 myPanel.add(txtID);
 myPanel.add(lblName);
 myPanel.add(txtName);
 myPanel.add(lblQuantity);
 myPanel.add(txtQuantity);
 myPanel.add(lblPrice);
 myPanel.add(txtPrice);
 
 myPanel.add(btnPrev);
 myPanel.add(btnNext);
 myPanel.add(btnFirst);
 myPanel.add(btnLast);
 myPanel.add(btnSave);
 myPanel.add(btnUpdate);
 
 myPanel.setLayout(new GridLayout(7,2));
 
 MainWindow.add(myPanel);
 MainWindow.setVisible(true);
 
 btnNext.addActionListener(this);
 btnPrev.addActionListener(this);
 btnLast.addActionListener(this);
 btnFirst.addActionListener(this);
 btnUpdate.addActionListener(this);
} 
public void DisplayData(){
    try{
       res.next();
       txtID.setText(res.getString("ID"));
       txtName.setText(res.getString("NAME"));
       txtQuantity.setText(res.getString("QUANTITY"));
       txtPrice.setText(res.getString("PRICE"));
    }
    catch(Exception ex)
    {System.out.println(ex);}
}
    @Override
    public void actionPerformed(ActionEvent e) {
        Object SRC=e.getSource();
        if(SRC==btnNext)
        {btn_Next_Action();}
        if(SRC==btnPrev)
        {btn_Prev_Action();}
        if(SRC==btnFirst)
        {btn_First_Action();}    
       if (SRC==btnLast)
        {btn_Last_Action();}
       if(SRC==btnUpdate)
       {btn_Update_Action();}
    }
    public void btn_Next_Action(){
    try{
       if(res.next()){
       
       txtID.setText(res.getString("ID"));
       txtName.setText(res.getString("NAME"));
       txtQuantity.setText(res.getString("QUANTITY"));
       txtPrice.setText(res.getString("PRICE"));
       } 
       else{
           res.previous();
           JOptionPane.showMessageDialog(null,"Reached Last Record");
       }
    }
    catch(Exception ex)
    {System.out.println(ex);}    
    }
  public void btn_Prev_Action(){
      try{
       if(res.previous()){
       
       txtID.setText(res.getString("ID"));
       txtName.setText(res.getString("NAME"));
       txtQuantity.setText(res.getString("QUANTITY"));
       txtPrice.setText(res.getString("PRICE"));
       } 
       else{
           res.next();
           JOptionPane.showMessageDialog(null,"Reached First Record");
       }
    }
    catch(Exception ex)
    {System.out.println(ex);}  
  } 
  public void btn_First_Action(){
     try{
       res.first();
       txtID.setText(res.getString("ID"));
       txtName.setText(res.getString("NAME"));
       txtQuantity.setText(res.getString("QUANTITY"));
       txtPrice.setText(res.getString("PRICE"));
    }
    catch(Exception ex)
    {System.out.println(ex);} 
  }
  public void btn_Last_Action(){
    try{
       res.last();
       txtID.setText(res.getString("ID"));
       txtName.setText(res.getString("NAME"));
       txtQuantity.setText(res.getString("QUANTITY"));
       txtPrice.setText(res.getString("PRICE"));
    }
    catch(Exception ex)
    {System.out.println(ex);}   
  } 
  public void btn_Update_Action(){
      try{
        
         res.updateInt("ID",Integer.parseInt(txtID.getText()));
         res.updateString("NAME",txtName.getText());
         res.updateDouble("QUANTITY",Double.parseDouble(txtQuantity.getText()));
         res.updateInt("PRICE",Integer.parseInt(txtPrice.getText()));
         res.updateRow();        
         JOptionPane.showMessageDialog(null,"Updated");
      }
      catch(Exception ex)
      {System.out.println(ex);}
  }
    }
