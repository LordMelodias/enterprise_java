import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.*;
public class servlet1 extends HttpServlet {
    
 @Override
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter out = response.getWriter();
out.println("<form action=servlet2 >");
try {
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","root");
Statement stmt = con.createStatement();
ResultSet res = stmt.executeQuery("select * from quiz");
out.println("<table border=1 >");
int qno=0;
while(res.next()){
qno++;
out.println("<tr><td>"+res.getString(1)+"</td>");
out.println("<td>"+res.getString(2)+"</td></tr>");
out.println("<tr><td><input type=radio name="+qno+" value="+res.getString(3)+"></td><td>"+res.getString(3)+"</td></tr>");
out.println("<tr><td><input type=radio name="+qno+" value="+res.getString(4)+"></td><td>"+res.getString(4)+"</td></tr>");
out.println("<tr><td><input type=radio name="+qno+" value="+res.getString(5)+"></td><td>"+res.getString(5)+"</td></tr>");
out.println("<tr><td><input type=radio name="+qno+" value="+res.getString(6)+"></td><td>"+res.getString(6)+"</td></tr>");
}
}catch(Exception e){out.println(e);}
out.println("</table>");
out.println("<input type=reset >");
out.println("<input type=submit value=SUBMIT >");
out.println("</form>"); } }


