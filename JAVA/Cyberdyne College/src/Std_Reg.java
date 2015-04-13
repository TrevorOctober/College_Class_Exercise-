
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import java.sql.*;

public class Std_Reg implements ActionListener{

    static String url="jdbc:mysql://localhost:3308/trevor";
    Connection conn=null;
    Statement st=null;
    ResultSet res=null;
    
    JLabel lblStdName,lblStdSurname,lblIdnum,lblCN,lblContact;
    JTextField txtname,txtsurname,txtid,txtcn,txtcontact,txtserach;
    JButton btnfirst,btnprev,btnnext,btnlast,btnadd,btndel,btnexit,btnview,btnnew,btnupdate,btnsearch;
    JRadioButton rdStd_name,rdStd_Surname,rdId,rdCn,rdContact;
    ButtonGroup btngrp;
    JPanel mypanel,mypanel2,mypanel3;

    public Std_Reg() {
        Gui();
        Connect();
        SelectData();
        Display();
    }

    private void Gui() {
        
        JFrame mainwindow=new JFrame();
        mainwindow.setTitle("Student Registration Form");
        mainwindow.setSize(800, 500);
        mainwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblStdName=new JLabel("Student Full Name: ");
        lblStdSurname=new JLabel("Student Surname: ");
        lblIdnum=new JLabel("Identity Number: ");
        lblCN=new JLabel("Course Name: ");
        lblContact=new JLabel("Contact Number: ");
        
        txtname=new JTextField(10);
        txtsurname=new JTextField(10);
        txtid=new JTextField(10);
        txtcn=new JTextField(10);
        txtcontact=new JTextField(10);
        txtserach=new JTextField("search here. . .",10);
        
        btnadd=new JButton("Add");
        btndel=new JButton("Delete");
        btnexit=new JButton("Exit");
        btnfirst=new JButton("|<First");
        btnlast=new JButton("Last>|");
        btnnext=new JButton("Next");
        btnprev=new JButton("Previous");
        btnnew=new JButton("New");
        btnupdate=new JButton("Update");
        btnsearch=new JButton("Search");
        btnview=new JButton("Go to registered Students>>>");
        
        rdStd_name = new JRadioButton("Student Name",true);
        rdStd_Surname = new JRadioButton("Student Surname");
        rdId = new JRadioButton("Id Number");
        rdCn = new JRadioButton("Course Name");
        rdContact = new JRadioButton("Contact Number");
        
        btngrp = new ButtonGroup();
        btngrp.add(rdStd_name);
        btngrp.add(rdStd_Surname);
        btngrp.add(rdId);
        btngrp.add(rdCn);
        btngrp.add(rdContact);
        
        
        mypanel2 = new JPanel();
        mypanel2.setLayout(new GridLayout(3,4));
        mypanel2.add(btnfirst);
        mypanel2.add(btnprev);
        mypanel2.add(btnnext);
        mypanel2.add(btnlast);
        mypanel2.add(btnadd);
        mypanel2.add(btndel);
        mypanel2.add(btnexit);
        mypanel2.add(btnview);
        mypanel2.add(btnnew);
        mypanel2.add(btnupdate);
        mypanel2.add(btnsearch);
        mypanel2.add(txtserach);
        
        mypanel3 = new JPanel();
        mypanel3.setLayout(new GridLayout(2,2));
        mypanel3.add(rdStd_name);
        mypanel3.add(rdStd_Surname);
        mypanel3.add(rdId);
        mypanel3.add(rdCn);
        mypanel3.add(rdContact);
        
        mypanel=new JPanel();
        mypanel.setLayout(new GridLayout(6,2));
        mypanel.add(lblStdName);
        mypanel.add(txtname);
        mypanel.add(lblStdSurname);
        mypanel.add(txtsurname);
        mypanel.add(lblIdnum);
        mypanel.add(txtid);
        mypanel.add(lblCN);
        mypanel.add(txtcn);
        mypanel.add(lblContact);
        mypanel.add(txtcontact);
        mypanel.add(mypanel2);
        mypanel.add(mypanel3);
        
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
        btnview.addActionListener(this);
        
        mainwindow.add(mypanel);
        mainwindow.setVisible(true);
    }

    private void Connect() {
        try{
          conn=DriverManager.getConnection(url,"root", "12345");
           System.out.println("Connected");
        }catch(Exception ex){
            System.out.println("Not Connected");
            ex.getMessage();
        }// User_name | Password
    }

    private void SelectData() {
        try{
            st=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String sql="SELECT * FROM cyberdyne_college";
            res=st.executeQuery(sql);
        }catch(Exception ex){
         ex.printStackTrace();   
        }
    }

    private void Display() {
        try{
   // std_full_name  | std_surname  | Id_num        | course_name      | contact_num

          res.next();
              txtname.setText(res.getString("std_full_name"));
              txtsurname.setText(res.getString("std_surname"));
              txtid.setText(res.getString("Id_num"));
              txtcn.setText(res.getString("course_name"));
              txtcontact.setText(res.getString("contact_num"));
           
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src=e.getSource();
        if(btnfirst == src)
        {first ();} 
        if(btnlast == src)
        {last ();}
        if(btnnext == src)
        {next ();} 
        if(btnprev == src)
        {prev ();} 
        if(btnnew == src)
        {Bnew ();} 
        if(btnadd == src)
        {add ();} 
        if(btndel == src)
        {delete ();} 
        if(btnupdate == src)
        {update ();}
        if(btnview == src)
        {view ();}
        if(btnexit == src)
        {exit ();} 
        if(btnsearch == src)
        {search ();}    
    }

    private void first() {
        try{
            res.first();
              txtname.setText(res.getString("std_full_name"));
              txtsurname.setText(res.getString("std_surname"));
              txtid.setText(res.getString("Id_num"));
              txtcontact.setText(res.getString("course_name"));
              txtcn.setText(res.getString("contact_num"));
    }catch(Exception ex){
        ex.printStackTrace();
    }

    }

    private void last() {
        try{
           res.last();
              txtname.setText(res.getString("std_full_name"));
              txtsurname.setText(res.getString("std_surname"));
              txtid.setText(res.getString("Id_num"));
              txtcn.setText(res.getString("course_name"));
              txtcontact.setText(res.getString("contact_num"));
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    private void next() {
        try{
            if(res.next()){
              txtname.setText(res.getString("std_full_name"));
              txtsurname.setText(res.getString("std_surname"));
              txtid.setText(res.getString("Id_num"));
              txtcn.setText(res.getString("course_name"));
              txtcontact.setText(res.getString("contact_num"));
            }else{
                res.previous();
                JOptionPane.showMessageDialog(null, "Reached the last record");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    private void prev() {
        try{
            if(res.previous()){
              txtname.setText(res.getString("std_full_name"));
              txtsurname.setText(res.getString("std_surname"));
              txtid.setText(res.getString("Id_num"));
               txtcn.setText(res.getString("course_name"));
              txtcontact.setText(res.getString("contact_num"));
            }else{
                res.next();
                JOptionPane.showMessageDialog(null, "Reached the first record");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
            
    }

    private void Bnew() {
       
              txtname.setText("");
              txtsurname.setText("");
              txtid.setText("");
              txtcontact.setText("");
              txtcn.setText("");
    }

    private void add() {
        try{
            // // std_full_name  | std_surname  | Id_num        | course_name      | contact_num
           res.moveToInsertRow();
           res.updateString("std_full_name", txtname.getText());
           res.updateString("std_surname", txtsurname.getText());
           res.updateString("Id_num", txtid.getText());
           res.updateString("course_name", txtcn.getText());
           res.updateString("contact_num", txtcontact.getText());
           
           res.insertRow();
           
           st.close();
           SelectData();
           res.last();
           
           JOptionPane.showMessageDialog(null, "Saved!");
           
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    private void delete() {
        try{
           res.deleteRow();
           res.previous();
           Display();
           
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    private void update() {
        try{
           
           res.updateString("std_full_name", txtname.getText());
           res.updateString("std_surname", txtsurname.getText());
           res.updateString("Id_num", txtid.getText());
           res.updateString("course_name", txtcn.getText());
           res.updateString("contact_num", txtcontact.getText());
           res.updateRow();
           
           JOptionPane.showMessageDialog(null, "Updated!");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    private void view() {
     Std_info go = new Std_info();   
    }

    private void exit() {
        System.exit(1);
    }

    private void search() {
        String google = txtserach.getText().trim();
        try{
            
            st.close();
            st=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String qry = "SELECT * FROM cyberdyne_college WHERE ";
            if(rdStd_name.isSelected()){qry = qry + "std_full_name LIKE '%" + google + "%'";}
            if(rdStd_Surname.isSelected()){qry = qry + "std_surname LIKE '%" + google + "%'";}
            if(rdId.isSelected()){qry = qry + "Id_num LIKE'%" + google + "%'";}
            if(rdCn.isSelected()){qry = qry + "course_name LIKE '%" + google + "%'";}
            if(rdContact.isSelected()){qry = qry + "contact_num LIKE '%" + google + "'%";}
            
            res=st.executeQuery(qry);
            
            int count=0;
            String store="";
            String response="";
            
            while(res.next()){
                count++;
                
                store = store + "\n" + count + ". "+
                        res.getString("std_full_name") + "||" +
                        res.getString("std_surname") + "||" +
                        res.getString("Id_num") + "||" +
                        res.getString("course_name") + "||" +
                        res.getString("contact_num");
            }
            if(count !=0){
               
                res.absolute(count);
                response ="Number of Records that match" + count + store;
                JOptionPane.showMessageDialog(null, response);
            }else{
                JOptionPane.showMessageDialog(null, "Could not find that.");
            }
            SelectData();
            res.first();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        txtserach.setText("");
    }
}

