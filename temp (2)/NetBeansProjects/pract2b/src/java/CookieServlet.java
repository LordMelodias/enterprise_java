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
    private int i =1;
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("uname");
        String k=String.valueOf(i);
        Cookie c = new Cookie("visit",k);
        response.addCookie(c);
        int j=Integer.parseInt(c.getValue());
        if(j==1)
        {
            out.println(name  + " This is the first time you are visiting this page");
        }
        else
        {
            synchronized(this)
            {
                out.println(name + " You visited this page "+i+" times");
            }           
        }
            i++;
    }
}


