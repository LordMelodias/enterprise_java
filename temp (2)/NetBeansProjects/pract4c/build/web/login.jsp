<%@page contentType="text/html" import="java.sql.*"%>
<html><body>
<h1>Registration JSP Page</h1>
<%
String username=request.getParameter("username");
String password = request.getParameter("password");
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rohit","root","root");
Statement st= con.createStatement(); 
ResultSet rs=st.executeQuery("select * from ROHAN where username='"+username+"' and password='"+password+"'"); 
try{
rs.next();
	        if(rs.getString("password").equals(password)&&rs.getString("username").equals(username)) 
			{ 
			      out.println("Welcome "  +username); 
			} 
else{
out.println("<h1>User Name not exist !!!!!</h1>");
%>
<jsp:include page="login.html" ></jsp:include>
<%
}
}catch(Exception e){out.println(e);}
%>
</body></html>

