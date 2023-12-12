<%-- 
    Document   : index
    Created on : 28-Aug-2023, 10:27:19?am
    Author     : Rohit
--%>

<!-- Function Core Tag-->
<!-- toUpperCase Function tag -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title> Using JSTL Function </title>  
</head>  
<body>  
<c:set var="string" value="Welcome to JSP Programming"/>  
${fn:toUpperCase("hello,")}  
${fn:toLowerCase(string)}  
</body>  
</html> 
