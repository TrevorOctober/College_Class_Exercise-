/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author TREVOR OCTOBER
 */
public class JavaConnection {
static String DURL ="jdbc:mysql://localhost:3308/MyCustomers";
    
    public static void main(String[] args) {
        
        Connection con=null;
        Statement st=null;
        ResultSet res=null;
        
       try {
          con =DriverManager.getConnection(DURL, "root", "1234");
          System.out.println("Connected");
          
               String SQL ="SELECT * from Customers";
               st =con.createStatement();
               res =st.executeQuery(SQL);
               
               ResultSetMetaData data = res.getMetaData();
               int columns =data.getColumnCount();
               for (int i = 0; i < columns; i++) {
                   System.out.printf("%-20s\t", data.getColumnName(i));
               }
               System.out.println();
               while(res.next()){
                for (int i = 0; i < columns; i++) {
                    System.out.printf("%-20s\t" ,res.getObject(i));
           }
           System.out.println();
           }
       
       }
        catch (SQLException ex){
            System.out.println("Not Connected");
            System.out.println(ex.getMessage());
            
    }
  }
 }
