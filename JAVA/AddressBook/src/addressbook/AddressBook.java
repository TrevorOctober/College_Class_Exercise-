
package addressbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class AddressBook {
static String URL="jdbc:mysql://localhost:3308/addressbook";
   
    public static void main(String[] args) {
    Connection conn=null;
    Statement st=null;
    ResultSet res=null;
    
    try{
        conn=DriverManager.getConnection(URL, "root", "1234");
         System.out.println("Connected"); 
        st=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        res=st.executeQuery("Select*from addressbook");
        
        ResultSetMetaData data=res.getMetaData();
        int columns=data.getColumnCount();
        for (int i = 1; i <=columns; i++) {
            System.out.printf("%-20s\t", data.getColumnName(i));
        }
            
        
         System.out.println();
        while(res.next()){
            for (int i = 1; i <=columns; i++) {
                System.out.printf("%-20s\t", res.getObject(i));
            } 
        
       System.out.println();
        } 
    }
    catch (SQLException ex){
    System.out.println("Not connected");    
      System.out.println(ex);     
    }
    }
}
