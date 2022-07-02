/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnector;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
public class DeleteItemServlet extends HttpServlet {
 public void doGet(HttpServletRequest request ,HttpServletResponse response)throws ServletException,IOException
    {
        response.sendRedirect("");
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
        PrintWriter out =response.getWriter();
        
        
        String name=request.getParameter("name");
        
        
        Statement st=null;
        PreparedStatement ps=null;
        Connection con=null;
        DBConnector db=new DBConnector();
        st=DBConnector.getStatement();
        
        try
        {
            String query="Delete from add-to-cart Where food name='"+name+"'";
            
            con=db.getConnection();
            ps=con.prepareStatement(query);
            
            int x=ps.executeUpdate();
            if (x>0)
            {
                System.out.println("record inserted");
                out.println("<script type=\"text/javascript\">"); 
                out.println("alert('Deleted from cart');"); 
                out.println("location='index.jsp';"); 
                out.println("</script>"); 
            }
            else
                {
                    System.out.println("deletion failed");
                }
        }
        catch(SQLException e)
        {
             System.out.println(e);
                    out.println("<script type=\"text/javascript\">"); 
                    out.println("alert('Could not delete !');"); 
                    out.println("location='index.jsp';"); 
                    out.println("</script>"); 
        }
    }

}
