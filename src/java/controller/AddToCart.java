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
public class AddToCart extends HttpServlet {

 public void doGet(HttpServletRequest request ,HttpServletResponse response)throws ServletException,IOException
    {
        response.sendRedirect("");
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
        PrintWriter out =response.getWriter();
        
        
        String Name=request.getParameter("name");
        String Quantity=request.getParameter("quantity");
        String Price=request.getParameter("price");
        
        
        Statement st=null;
        PreparedStatement ps=null;
        Connection con=null;
        DBConnector db=new DBConnector();
        st=DBConnector.getStatement();
        
        try
        {
            String query1="insert into cart Values(?,?,?)";
            
            con=db.getConnection();
            ps=con.prepareStatement(query1);
            
            ps.setString(1,Name);
            ps.setString(2, Quantity);
            ps.setString(3, Price);
            
            
            
            int x=ps.executeUpdate();
            if (x>0)
            {
                System.out.println("record inserted");
                out.println("<script type=\"text/javascript\">"); 
                out.println("alert('Added to cart');"); 
                out.println("location='index_1.jsp';"); 
                out.println("</script>"); 
            }
            else
                {
                    System.out.println("insertion failed");
                }
        }
        catch(SQLException e)
        {
             System.out.println(e);
                    out.println("<script type=\"text/javascript\">"); 
                    out.println("alert('Could not add !');"); 
                    out.println("location='index_1.jsp';"); 
                    out.println("</script>"); 
        }
    }

}