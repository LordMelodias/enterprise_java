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
public class Redirect extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws jakarta.servlet.ServletException
     * @throws java.io.IOException
     */
  
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Cookie[] allCookies = request.getCookies();
        String name,val;
        for(int i = 0; i<allCookies.length; i++) 
        {
            name = allCookies[i].getName();
            val = allCookies[i].getValue();
            out.println("<br> Name : " + name + " -  Value : " + val);
        }
        
    }
    
}


