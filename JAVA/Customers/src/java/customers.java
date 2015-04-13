/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author TREVOR OCTOBER
 */
@WebServlet(name = "customers", urlPatterns = {"/customers"})
public class customers extends HttpServlet {
 ResultSet rs;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
           
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet customers</title>");            
            out.println("</head>");
            out.println("<body>");
       
            out.println("<h1><form action \"customer\" method=\"post\"></h1>");
            out.println("<h3>CustomerID:</h3>");
            out.println("<h3><input type= \"text\" name=\"txtCustomerID\"></h3>");
            out.println("<h3>Name:</h3>");
            out.println("<h3><input type= \"text\" name=\"txtName\"></h3>");
            out.println("<h3>Address:</h3>");
            out.println("<h3><input type= \"text\" name=\"txtAddress\"></h3>");
            out.println("<h3>City:</h3>");
            out.println("<h3><input type= \"text\" name=\"txtCity\"></h3>");
            out.println("<h3><input type= \"submit\" name=\"btnSubmi\"value=\"Submit\"></h3>");
           out.println("<h3></form>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
       
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
         response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
        try { 
   Statement st,st2;         
//Class.forName("com.mysql.jdbc.Driver");  
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/3308/MyCustomers");

        
st=conn.createStatement();
st.executeUpdate("INSERT INTO Customers(CustomerID,Name,Address,City)VALUES(" +rs.getObject(0)+",'"+rs.getObject(1)+rs.getObject(2)+",'"+rs.getObject(3)+"')");
st.close();


st2=conn.createStatement();
String sql;
sql = "SELECT CustomerID, Name, Address, City FROM Customers";
ResultSet rs = st2.executeQuery(sql);
while(rs.next()){
     
    String CustomerID=request.getParameter("txtCustomerID");
    String Name=request.getParameter("txttxtName");
    String Address=request.getParameter("txtAddrss");
    String City=request.getParameter("txtCity");
    System.out.println(" "+CustomerID+" "+Name+" "+" "+Address+" "+City);
    
}
rs.close();
st2.close();
conn.close();
        } catch (SQLException e) {
           e.printStackTrace();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }   
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
