/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author Rohit
 */
public class CookieServlet extends HttpServlet {
    
    
    
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String un = request.getParameter("uname");
        String pd = request.getParameter("pass");
        Cookie c1 = new Cookie("Username",un);
        response.addCookie(c1);
        Cookie c2 = new Cookie("Password",pd);
        response.addCookie(c2);
        response.sendRedirect("Redirect");
    }

}
