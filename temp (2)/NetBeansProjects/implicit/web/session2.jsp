<html>
    <body>
        <%
            String name = (String)session.getAttribute("user");
            out.print("Welcome in my second page " + name);
        %>
    </body>
</html>