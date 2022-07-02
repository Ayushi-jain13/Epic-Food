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
public class RegisterServlet extends HttpServlet {
    
    public void doGet(HttpServletRequest request ,HttpServletResponse response)throws ServletException,IOException
    {
        response.sendRedirect("index.jsp");
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
        PrintWriter out =response.getWriter();
        
        String Fullname=request.getParameter("fullname");
        String Uname=request.getParameter("uname");
        String Email=request.getParameter("email");
        String Phone=request.getParameter("phone");
        String Password=request.getParameter("password");
        String Gender=request.getParameter("gender");
        
        Statement st=null;
        PreparedStatement ps=null;
        Connection con=null;
        DBConnector db=new DBConnector();
        st=DBConnector.getStatement();
        
        try
        {
            String query="insert into register Values (?,?,?,?,?,?)";
            
            con=db.getConnection();
            ps=con.prepareStatement(query);
            
            ps.setString(1,Fullname);
            ps.setString(2,Uname);
            ps.setString(3,Email);
            ps.setString(4, Phone);
            ps.setString(5, Password);
            ps.setString(6, Gender);
            
            int x=ps.executeUpdate();
            if (x>0)
            {
                System.out.println("record inserted");
                out.println("<script type=\"text/javascript\">"); 
                out.println("alert('Registration successfull');"); 
                out.println("location='index.jsp';"); 
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
                    out.println("alert('Select a unique username!');"); 
                    out.println("location='Register.jsp';"); 
                    out.println("</script>"); 
        }
    }

}