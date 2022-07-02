/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.LoginAuthenticator;

/**
 *
 * @author DELL
 */
public class LoginCheckerServlet extends HttpServlet {
public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
    
        response.sendRedirect("index.jsp");
    }
    
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
         PrintWriter out = response.getWriter();
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        LoginAuthenticator la=new LoginAuthenticator();
        boolean login = la.isLogin(email,password);
        
         if(login)
         {
            out.println("<script type=\"text/javascript\">"); 
            out.println("alert('Login Successful');"); 
            out.println("location='index_1.jsp';"); 
            out.println("</script>"); 
           
        }
        else
        {
           out.println("<script type=\"text/javascript\">"); 
           out.println("alert('Login FAIL....Please enter valid details !!');"); 
           out.println("location='index_1.jsp';"); 
           out.println("</script>"); 
         
        }
         
    }
}