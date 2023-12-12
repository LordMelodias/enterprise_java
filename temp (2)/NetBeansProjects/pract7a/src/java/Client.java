

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import servlet.CounterServletHitsBean;
@WebServlet(name= "ServletClient", urlPatterns={"/Client"})
public class Client extends HttpServlet {
  @EJB CounterServletHitsBean CounterBean;
   

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletClient</title>");           
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Number of times this servlet is accessed:" + CounterBean.incrementAndGetHitCount()+"</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
