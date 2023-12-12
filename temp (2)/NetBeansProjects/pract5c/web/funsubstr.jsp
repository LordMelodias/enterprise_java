<%-- 
    Document   : index
    Created on : 28-Aug-2023, 10:32:39?am
    Author     : Rohit
--%>

<!-- Function Core Tag-->
<!--  substring tag = Convert given string into substring-->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Function </title>  
</head>  
<body>  
<c:set var="string" value="This is the first string."/>  
${fn:substring(string, 5, 17)}  
</body>  
</html>
