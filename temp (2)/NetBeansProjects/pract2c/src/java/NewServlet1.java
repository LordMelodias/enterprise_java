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
public class NewServlet1 extends HttpServlet {
    private int counter=0;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            HttpSession session=request.getSession(true);      
            if(session.isNew())
            {
                out.println("This is the first time you are visiting this page");
                counter = 1;
            }
            else
            {
                synchronized(this)
                {
                    out.print("You have visited this page "+(++counter)+ " times");
                }
            }
            out.println("<br>" + "<p>Session ID= "+session.getId() + "</p>");
            out.println("Session Creation Time : "+ new java.util.Date(session.getCreationTime()));
            out.println("<br>"+"<form action=logout>" + "<input type=submit value = Logout>" + "</form>");           
    }
}

            
