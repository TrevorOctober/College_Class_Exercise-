/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serv;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PEARL OCTOBER
 */
@WebServlet(name = "myservlet", urlPatterns = {"/myservlet"})
public class myservlet extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            
            String name=request.getParameter("txtname");
             String pass=request.getParameter("txtpass"); 
            out.println("<html>");
            out.println("<head>");
            out.println("<title>myservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            if (name.equalsIgnoreCase("Trevor")||pass.equalsIgnoreCase("4321"))
            out.println("<h1>Hello " + name +" Your password is "+pass+ "</h1>");
            else
              out.println("incorrect login details");
                // response.sendRedirect("index.jsp");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }}}
    

   