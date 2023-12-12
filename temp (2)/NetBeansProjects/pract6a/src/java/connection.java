/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */


import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import rohit.CCBean;

public class connection extends HttpServlet {

    @EJB CCBean obj;
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        double amt = Double.parseDouble(request.getParameter("amt"));
        if(request.getParameter("type").equals("r2d"))
        {
            out.println("<h1>"+amt+ " Rupees = "+obj.r2Dollor(amt)+" Dollors</h1>");
        }
        if(request.getParameter("type").equals("d2r"))
        {
            out.println("<h1>"+amt+ " Dollors = "+obj.d2Rupees(amt)+" Rupees</h1>");
        }
    }
    
}
