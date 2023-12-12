<html>
    <body>
        <h1 align='center'>About Page</h1>
        <% 
            String name = (String) session.getAttribute("user");
            out.println("User Name: "+name);
        %>
    </body>
</html>
