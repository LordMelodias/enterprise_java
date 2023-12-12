/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;

/**
 *
 * @author Rohit
 */
public class calci extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
 PrintWriter out = response.getWriter();
 
int n1 = Integer.parseInt(request.getParameter("txtN1"));
int n2 = Integer.parseInt(request.getParameter("txtN2"));
 
 int result =0;
 String opr=request.getParameter("op");
 if(opr.equals("+")) result=n1+n2; 
if(opr.equals("-")) result=n1-n2;
 if(opr.equals("*")) result=n1*n2; 
if(opr.equals("/")) result=n1/n2;
out.println("<h1> Result = "+result); 
out.println("</body></html>");
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
   


    

}
