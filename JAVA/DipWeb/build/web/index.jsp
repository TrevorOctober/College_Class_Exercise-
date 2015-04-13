<%-- 
    Document   : index
    Created on : Nov 15, 2013, 12:03:36 PM
    Author     : PEARL OCTOBER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="myservlet" method="POST">
            <table> 
                <tr>
                    <td> Name:</td><td><input type="text" name="txtname"></td></tr><br>
                <tr>
       <td>Password:</td><td><input type="password" name="txtpass"></td></tr><br>
                <tr>
                    <td> <input type="submit" name="btnsub" value="Submit"></td><td> 
       <input type="reset" name="btnsub" value="Cancel"></td></tr>
            </table>
        </form>
    </body>
</html>
