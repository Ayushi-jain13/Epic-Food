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
import model.CheckoutAuthenticator;

/**
 *
 * @author user
 */
public class ProceedToCheckout extends HttpServlet {
public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
    
        response.sendRedirect("index._1jsp");
    }
    
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        PrintWriter out = response.getWriter();
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        CheckoutAuthenticator ptc=new CheckoutAuthenticator();
        boolean proceedToCheckout = ptc.isCheckout(email,password);
        
         if(proceedToCheckout)
         {
            out.println("<script type=\"text/javascript\">"); 
            out.println("alert('Your order has been placed !!');"); 
            out.println("location='index_1.jsp';"); 
            out.println("</script>"); 
           
        }
        else
        {
           out.println("<script type=\"text/javascript\">"); 
           out.println("alert('Your order has been placed !!');"); 
           out.println("location='index_1.jsp';"); 
           out.println("</script>"); 
         
        }
         
    }
}