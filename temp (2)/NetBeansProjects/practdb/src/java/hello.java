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
import rohit.RRBean;

/**
 *
 * @author Rohit
 */
public class hello extends HttpServlet {

    @EJB RRBean obj;
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        String rt=request.getParameter("txtType");
        String cn=request.getParameter("txtCust");
        String cm=request.getParameter("txtMob");
        String msg = obj.roomBook(rt, cn, cm);
        out.println(msg);
    }
}
