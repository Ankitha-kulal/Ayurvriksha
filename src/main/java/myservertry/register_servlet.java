
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package myservertry;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ankit
 */
public class register_servlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      String fname =request.getParameter("first");
      String lname =request.getParameter("second");
      String phone =request.getParameter("phno");
      String mail =request.getParameter("email");
      String Address =request.getParameter("address");
 
      String password =request.getParameter("password"); 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//driver class registration
            String url="jdbc:mysql://localhost:3306/alvas_internship_db";
            Connection con=DriverManager.getConnection(url, "root", "Ankitha@21");// Connection establishment
            Statement stmt=con.createStatement();// Creating statement
            String sql="INSERT INTO plantlogin(Fname, Lname,Contactno,email,Address,PASSWORD)values('"+fname+"','"+lname+"','"+phone+"','"+mail+"','"+Address+"','"+password+"')";
            stmt.executeUpdate(sql);// execution of the queries
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(register_servlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(register_servlet.class.getName()).log(Level.SEVERE, null, ex);
        }
      }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

