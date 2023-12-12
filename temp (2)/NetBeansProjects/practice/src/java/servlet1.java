import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Cookie;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Rohit
 */
public class servlet1 extends HttpServlet {

    private int i = 1;
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
            res.setContentType("text/html");
            PrintWriter out = res.getWriter();
            String k = String.valueOf(i);
            Cookie c = new Cookie("visited", k);
            int j = Integer.parseInt(c.getValue());
            if(j==1)
            {
                out.println("You visited this page for first time.");
            }
            else
            {
                synchronized(this)      //synchronized meaning no more than one thread will be able to access the code inside that block.
                {
                    out.print("You visited page " + i + " time");
                }
            }
            i++;
    }
}
