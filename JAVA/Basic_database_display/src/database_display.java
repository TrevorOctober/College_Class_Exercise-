import java.sql.*;

public class database_display{

    static String url="jdbc:mysql://localhost:3308/dju";
    
    public static void main(String [] args){
     
        try{
        Connection conn=DriverManager.getConnection(url,"root","1234");
        System.out.println("Connected");
        
        Statement st=conn.createStatement();
        String sql="SELECT * FROM djs";
        ResultSet res=st.executeQuery(sql);
        
        ResultSetMetaData data=res.getMetaData();
        int colmuns=data.getColumnCount();
        for(int i=1; i <=colmuns;i++){
            System.out.printf("%-20s\t", data.getColumnName(i));
        }
        System.out.println();
        while(res.next()){
            for(int i=1; i <=colmuns;i++){
            System.out.printf("%-20s\t", res.getObject(i));
        }
             System.out.println();
        }
       
        }catch(Exception ex){
            System.out.println("Not Connected"+"\n"
                    + ex.getMessage());
        } 
    }
}