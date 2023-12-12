import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import mybeans.RRBean;


public class RBServlet extends HttpServlet {
    @EJB RRBean obj;
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
String id=request.getParameter("id");  
String s1=request.getParameter("sub1");
String n=request.getParameter("sname");
String s2=request.getParameter("sub2");
String msg = obj.markenter(id, n, s1, s2);
response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println(msg);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RBServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RBServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
