<%-- 
    Document   : index
    Created on : 28-Aug-2023, 10:46:18?am
    Author     : Rohit
--%>

<!-- xml core tag -->
<!-- parse = used for parse the xml content and the result will stored inside specified variable. -->

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>  
  
<html>  
<head>  
  <title>x:parse Tag</title>  
</head>  
<body>  
<h2>User Info:</h2>  
<c:import var="userInfo" url="user.xml"/>  
  
<x:parse xml="${userInfo}" var="output"/>  
<p>User Name: <x:out select="$output/users/user[1]/name" /></p>
</body>  
</html>