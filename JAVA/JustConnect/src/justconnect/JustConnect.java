
package justconnect;

import java.sql.*;

public class JustConnect {
    
 static String URL="jdbc:mysql://localhost:3308/addressbook";
     
    public static void main(String[] args) {
     
         Connection conn=null;
         
      
        try{
          conn=DriverManager.getConnection(URL, "root", "1234");
          System.out.println("Connected"); 

        }
       catch(Exception ex){
           System.out.println("Not Connected");
           System.out.println(ex.getMessage());   
       }    
    }
}
