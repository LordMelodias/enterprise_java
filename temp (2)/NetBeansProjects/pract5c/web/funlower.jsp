<%-- 
    Document   : index
    Created on : 28-Aug-2023, 10:17:45?am
    Author     : Rohit
--%>
<!-- Function tag  -->
<!-- Function Tag:-  functions are common string manipulation functions -->

<!-- toLowerCase() function tag-->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title> Using JSTL Function Tag </title>  
</head>  
<body>  
<c:set var="string" value="Welcome to JSP Programming"/>  
${fn:toLowerCase("HELLO,")}  
${fn:toLowerCase(string)}  
</body>  
</html> 