<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
    </head>
    <body>
        <%out.print("Today is "+ java.util.Calendar.getInstance().getTime()); %>
    </body>
</html>
