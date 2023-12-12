<html>
    <body>
        <% String name=request.getParameter("uname");  
        out.print("Welcome "+name);  
  
        session.setAttribute("user",name);  
  
        <a href="session2.jsp">second jsp page</a>  
        %>                    
    </body>
</html>
