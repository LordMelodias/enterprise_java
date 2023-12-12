/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


/**
 *
 * @author Rohit
 */
public class sessionpage extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session=request.getSession();
        out.println("Session ID= "+session.getId());
        out.println("<br>Session Creation Time"+session.getCreationTime());
        out.println("<br>Session Last Action Time= "+ session.getLastAccessedTime());
        out.println("<br> Max InActive time Interval"+session.getMaxInactiveInterval());
        session.setMaxInactiveInterval(6);
        out.println("<br> InActive time Interval" + session.getMaxInactiveInterval());
        response.setHeader("Refresh", new Integer(session.getMaxInactiveInterval()).toString());
    }
}
