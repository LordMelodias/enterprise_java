<%   
out.print("Welcome "+request.getParameter("uname"));  
  
String driver=config.getInitParameter("dname");  
out.print("driver name is="+driver);  
%>

<!-- xml file required which is not working -->
<!--
<web-app>

<servlet>

    <servlet-name>Rohit</servlet-name>
    <jsp-file>config.jsp</jsp-file>

<init-param>
    <param-name>dname</param-name>                    
    <param-value>sun.jdbc.odbc.JdbcOdbcDriver</param-value>
</init-param>

</servlet>

<servlet-mapping>
    <servlet-name>Rohit</servlet-name>
    <url-pattern>/config</url-pattern>
</servlet-mapping>

</web-app>
-->

