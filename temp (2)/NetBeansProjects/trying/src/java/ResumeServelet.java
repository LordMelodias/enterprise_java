
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
public class ResumeServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String name = request.getParameter("name");
		//String id = request.getParameter("id");
		String action = request.getParameter("action");
 
		//	String textname = request.getParameter("textname");
           RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		   dispatcher.forward(request, response);			
	}
}