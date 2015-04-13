import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.util.*;

public class Cities implements ActionListener{
    static String url="jdbc:mysql://localhost:3308/trevor";
    Connection conn=null;
    Statement st=null;
    ResultSet res=null;
    
    JLabel lblcity,lblcountry,lblpop2005,lblpop2015,lblmunit,lblsearch;
    JTextField txtcity,txtcountry,txtpop2005,txtpop2015,txtmunit,txtsearch;
    JButton btnfirst,btnlast,btnnext,btnprev,btnadd,btndel,btnnew,btnupdate,btnsearch,btnexit;
    JRadioButton rdcity,rdcountry,rdpop2005,rdpop2015,rdmunit;
    ButtonGroup btngroup;
    JPanel north,center,south;
    
    
    public static void main(String []args){
     
        new Cities(); 
    }
    public Cities (){
    Gui();
    Connect();
    SelectData();
    Display();
}

    private void Gui() {
      JFrame mainwindow=new JFrame();
       mainwindow.setTitle("Megacities");
       mainwindow.setSize(800, 500);
       mainwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       lblcity=new JLabel("City: ");
       lblcountry=new JLabel("Country: ");
       lblmunit=new JLabel("Monetary Unit: ");
       lblpop2005=new JLabel("Pop2005: ");
       lblpop2015=new JLabel("Pop2015: ");
       lblsearch=new JLabel("Search");
       
       txtcity=new JTextField(10);
       txtcountry=new JTextField(10);
       txtmunit=new JTextField(10);
       txtpop2005=new JTextField(10);
       txtpop2015=new JTextField(10);
       txtsearch=new JTextField(10);
       
       btnadd=new JButton("Add");
       btndel=new JButton("Delete");
       btnexit=new JButton("Exit");
       btnfirst=new JButton("|<First");
       btnlast=new JButton("Last>|");
       btnnew=new JButton("New");
       btnnext=new JButton("Next");
       btnprev=new JButton("Previous");
       btnsearch=new JButton("Search");
       btnupdate=new JButton("Update");
       
      
       
       rdcity=new JRadioButton("City: ",true);
       rdcountry=new JRadioButton("Country: ");
       rdpop2005=new JRadioButton("Pop2005: ");
       rdpop2015=new JRadioButton("Pop2015: ");
       rdmunit=new JRadioButton("Monetary Unit: ");
       
       btngroup=new ButtonGroup();
       btngroup.add(rdcity);
       btngroup.add(rdcountry);
       btngroup.add(rdpop2005);
       btngroup.add(rdpop2015);
       btngroup.add(rdmunit);
        
       
       
       
       
       center=new JPanel();
       center.setLayout(new GridLayout(3,4));
       center.add(btnfirst);
       center.add(btnlast);
       center.add(btnnext);
       center.add(btnprev);
       center.add(btnadd);
       center.add(btndel);
       center.add(btnnew);
       center.add(btnupdate);
       center.add(btnexit);
       center.add(lblsearch);
       center.add(txtsearch);
       center.add(btnsearch);
       
       south=new JPanel();
       south.setLayout(new GridLayout(2,2));
       south.add(rdcity);
       south.add( rdcountry);
       south.add( rdpop2005);
       south.add(rdpop2015);
       south.add(rdmunit);
       
       north=new JPanel();
       north.setLayout(new GridLayout(6,2));
       north.add(lblcity);
       north.add(txtcity);
       north.add(lblcountry);
       north.add(txtcountry);
       north.add(lblpop2005);
       north.add(txtpop2005);
       north.add(lblpop2015);
       north.add(txtpop2015);
       north.add(lblmunit);
       north.add(txtmunit);
       north.add(center);
       north.add(south);
       
       btnadd.addActionListener(this);
       btndel.addActionListener(this);
       btnexit.addActionListener(this);
       btnfirst.addActionListener(this);
       btnlast.addActionListener(this);
       btnnew.addActionListener(this);
       btnnext.addActionListener(this);
       btnprev.addActionListener(this);
       btnsearch.addActionListener(this);
       btnupdate.addActionListener(this);
       
       mainwindow.add(north);
       mainwindow.setVisible(true);
    }

    private void Connect() {
        try{
            conn=DriverManager.getConnection(url, "root", "12345");
            System.out.println("Connected");
        }catch(Exception ex){
            System.out.println("Not Connected");
            ex.printStackTrace();
        }
    }

    private void SelectData() {
        try{
            st=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            String sql="SELECT * FROM megacities";
            res=st.executeQuery(sql);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    private void Display() {
        try{
           res.next();
           
               txtcity.setText(res.getString("City"));
               txtcountry.setText(res.getString("Country"));
               txtpop2005.setText(res.getString("Pop2005"));
               txtpop2015.setText(res.getString("Pop2015"));
               txtmunit.setText(res.getString("Monetary_Unit"));
          
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src=e.getSource();
        if(btnfirst==src)
        {Jbtn_first();} 
        if(btnlast==src)
        {Jbnt_last();} 
        if(btnnext==src)
        {Jbtn_next();}
        if(btnprev==src)
        {Jbtn_prev();}
        if(btnadd==src)
        {Jbtn_add();}
        if(btndel==src)
        {Jbtn_del();}
        if(btnnew==src)
        {Jbtn_new();}
        if(btnupdate==src)
        {Jbtn_update();} 
        if(btnsearch==src)
        {Jbtn_search();} 
        if(btnexit==src)
        {Jbtn_exit();}    
    }

    private void Jbtn_first() {
        try{
            res.first();
               txtcity.setText(res.getString("City"));
               txtcountry.setText(res.getString("Country"));
               txtpop2005.setText(res.getString("Pop2005"));
               txtpop2015.setText(res.getString("Pop2015"));
               txtmunit.setText(res.getString("Monetary_Unit"));
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    private void Jbnt_last() {
           try{
            res.last();
               txtcity.setText(res.getString("City"));
               txtcountry.setText(res.getString("Country"));
               txtpop2005.setText(res.getString("Pop2005"));
               txtpop2015.setText(res.getString("Pop2015"));
               txtmunit.setText(res.getString("Monetary_Unit"));
          
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    private void Jbtn_next() {
             try{
            if(res.next()){
               txtcity.setText(res.getString("City"));
               txtcountry.setText(res.getString("Country"));
               txtpop2005.setText(res.getString("Pop2005"));
               txtpop2015.setText(res.getString("Pop2015"));
               txtmunit.setText(res.getString("Monetary_Unit"));
            }else{
                res.previous();
                JOptionPane.showMessageDialog(null,"Reached last record");
            }
          
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    private void Jbtn_prev() {
              try{
            if(res.previous()){
               txtcity.setText(res.getString("City"));
               txtcountry.setText(res.getString("Country"));
               txtpop2005.setText(res.getString("Pop2005"));
               txtpop2015.setText(res.getString("Pop2015"));
               txtmunit.setText(res.getString("Monetary_Unit"));
            }else{
                res.next();
                JOptionPane.showMessageDialog(null,"Reached first record");
            }
          
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    private void Jbtn_add() {
            try{
            res.moveToInsertRow();
            res.updateString("City", txtcity.getText());
            res.updateString("Country",txtcountry.getText());
            res.updateDouble("Pop2005",Double.parseDouble(txtpop2005.getText()));
            res.updateDouble("Pop2015",Double.parseDouble(txtpop2015.getText()));
            res.updateString("Monetary_Unit",txtmunit.getText());
            
            res.insertRow();
            
            st.close();
            SelectData();
            
            res.last();
//            Display();
            JOptionPane.showMessageDialog(null,"Saved!");
          
        }catch(Exception ex){
            ex.printStackTrace();
        }  
    }

    private void Jbtn_del() {
        try{
            res.deleteRow();
            res.previous();
            Display();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    private void Jbtn_new() {
        txtcity.setText("");
        txtcountry.setText("");
        txtpop2005.setText("");
        txtpop2015.setText("");
        txtmunit.setText("");
    }

    private void Jbtn_update() {
        try{
           
            res.updateString("City",txtcity.getText());
            res.updateString("Country",txtcountry.getText());
            res.updateDouble("Pop2005",Double.parseDouble(txtpop2005.getText()));
            res.updateDouble("Pop2015",Double.parseDouble(txtpop2015.getText()));
            res.updateString("Monetary_Unit",txtmunit.getText());
            res.updateRow();
            
            JOptionPane.showMessageDialog(null,"Updated!");
          
        }catch(Exception ex){
            ex.printStackTrace();
        }  
    }

    private void Jbtn_search() {
        
        String items=txtsearch.getText().trim();
        
        try{
            st.close();
            st=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String SQL_Command="SELECT * FROM megacities WHERE ";
            if(rdcity.isSelected()){SQL_Command = SQL_Command + "City LIKE '%" + items + "%'";}
            if(rdcountry.isSelected()){SQL_Command = SQL_Command + "Country LIKE '%" + items + "%'";}
            if(rdpop2005.isSelected()){SQL_Command = SQL_Command + "Pop2005 LIKE '%" + items + "%'";}
            if(rdpop2015.isSelected()){SQL_Command = SQL_Command + "Pop2015 LIKE '%" + items + "%'";}
            if(rdmunit.isSelected()){SQL_Command = SQL_Command + "Monetary_Unit LIKE '%" + items + "%'";}
            
            res=st.executeQuery(SQL_Command);
            
            int Test =0;
            String Store ="";
            String Response = "";
            
            while(res.next()){
                Test++;
                
                Store = Store + "\n" + Test + ". "+
                        res.getString("City") + " " +
                        res.getString("Country") + " " +
                        res.getString("Pop2005") + " " +
                        res.getString("Pop2015") + " " +
                        res.getString("Monetary_Unit");
            }
            if(Test !=0){
                res.absolute(Test);
               // Display();
                Response="Number of Records that match" + Test + Store;
                
                JOptionPane.showMessageDialog(null, Response);
            }
            else{
                JOptionPane.showMessageDialog(null, "Could not find that.");
            }
            SelectData();
            res.first();
          //  Display();
        }catch(Exception ex){
         ex.printStackTrace();   
        }
        txtsearch.setText("");
    }

    private void Jbtn_exit() {
        System.exit(1);
    }
}

