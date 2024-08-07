/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package myservertry;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
public class login_servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          // user login process 
      String email =request.getParameter("email");
      String password =request.getParameter("password");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/alvas_internship_db";
            Connection con1=DriverManager.getConnection(url, "root", "Ankitha@21");
            Statement stmt=con1.createStatement();
             String sql="SELECT * FROM plantlogin WHERE email='"+email+"'";
            ResultSet result= stmt.executeQuery(sql);
            while(result.next()){
                if(result.getString("Password").equals(password)){
                    request.getRequestDispatcher("Azalea Bonsai.jsp").forward(request, response);
                }
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login_servlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(login_servlet.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
      
    

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
