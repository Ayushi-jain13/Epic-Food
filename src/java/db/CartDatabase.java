/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package db;

import java.sql.*;  
import java.io.*;  
/**
 *
 * @author DELL
 */
public class CartDatabase {
    public static void main(String[] args) {  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/food","root","root");  
              
PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)");  
ps.setString(1,"sonoo");  
  
FileInputStream fin=new FileInputStream("Food\\web\\image");  
ps.setBinaryStream(2,fin,fin.available());  
int i=ps.executeUpdate();  
System.out.println(i+" records affected");  
          
con.close();  
}catch (Exception e) {e.printStackTrace();}  
}  
}