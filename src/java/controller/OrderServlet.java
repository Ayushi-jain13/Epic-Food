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
 * @author user
 */
public class OrderServlet extends HttpServlet {

    public void doGet(HttpServletRequest request ,HttpServletResponse response)throws ServletException,IOException
    {
        response.sendRedirect("");
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
        PrintWriter out =response.getWriter();
        
        String Name=request.getParameter("name");
        String Number=request.getParameter("number");
        String Food=request.getParameter("food");
        String Order=request.getParameter("order");
        String Message=request.getParameter("message");
        String Date=request.getParameter("date");
        String Address=request.getParameter("address");
        
        Statement st=null;
        PreparedStatement ps=null;
        Connection con=null;
        DBConnector db=new DBConnector();
        st=DBConnector.getStatement();
        
        try
        {
            String query="insert into order Values(?,?,?,?,?,?.?)";
            
            con=db.getConnection();
            ps=con.prepareStatement(query);
            
            ps.setString(1,Name);
            ps.setString(2,Number);
            ps.setString(3,Food);
            ps.setString(4, Order);
            ps.setString(5, Message);
            ps.setString(6, Date);
            ps.setString(7, Address);
            
            int x=ps.executeUpdate();
            if (x>0)
            {
                System.out.println("record inserted");
                out.println("<script type=\"text/javascript\">"); 
                out.println("alert('Order sent');"); 
                out.println("location='index_1.jsp';"); 
                out.println("</script>"); 
            }
            else
                {
                    System.out.println("record insertion failed");
                }
        }
        catch(SQLException e)
        {
             System.out.println(e);
                    out.println("<script type=\"text/javascript\">"); 
                    out.println("alert('Order unsuccessfull');"); 
                    out.println("location='index_1.jsp';"); 
                    out.println("</script>"); 
        }
    }

}